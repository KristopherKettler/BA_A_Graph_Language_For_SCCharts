package info.scce.cinco.product.scchart.mglid.mcam.cli;

import info.scce.cinco.product.scchart.mglid.mcam.adapter.SCChartId;
import info.scce.cinco.product.scchart.mglid.mcam.adapter.SCChartAdapter;

import info.scce.cinco.product.scchart.mglid.scchart.SCChart;

import info.scce.mcam.framework.processes.CheckProcess;
import info.scce.mcam.framework.processes.CompareProcess;
import info.scce.mcam.framework.processes.MergeProcess;
import info.scce.mcam.framework.registry.change.ChangeModuleRegistry;
import info.scce.mcam.framework.registry.change.ChangeModuleRegistryClassTreeBased;
import info.scce.mcam.framework.registry.check.CheckModuleRegistry;
import info.scce.mcam.framework.registry.check.CheckModuleRegistryListBased;

import java.io.File;
import org.eclipse.emf.ecore.resource.Resource;

import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoMergeStrategy;

public class SCChartExecution extends de.jabc.cinco.meta.plugin.mcam.runtime.core.FrameworkExecution<SCChartId, SCChart, SCChartAdapter> {

	@Override
	public SCChartAdapter initApiAdapter(File file) {
		SCChartAdapter model = new SCChartAdapter();
		model.readModel(file);
		return model;
	}

	@Override
	public SCChartAdapter initApiAdapterFromResource(Resource resource, File file) {
		SCChartAdapter model = new SCChartAdapter();
		model.readModel(resource, file);
		return model;
	}

	@Override
	public ChangeModuleRegistry<SCChartId, SCChartAdapter> getChangeModuleRegistry() {
		ChangeModuleRegistry<SCChartId, SCChartAdapter> reg = new ChangeModuleRegistryClassTreeBased<>();
		

		return reg;
	}

	@Override
	public CheckModuleRegistry<SCChartId, SCChartAdapter> getCheckModuleRegistry() {
		CheckModuleRegistry<SCChartId, SCChartAdapter> reg = new CheckModuleRegistryListBased<>();

		reg.add(new info.scce.cinco.product.scchart.checks.RootStateCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.RegionCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.SuperStateCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.DeclarationCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.SuspensionCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.ActionCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.StateCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.SCChartRefereceCheck());
		reg.add(new info.scce.cinco.product.scchart.checks.TransitionCheck());
		reg.add(new info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartContainmentCheck());
		reg.add(new info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartIncomingCheck());
		reg.add(new info.scce.cinco.product.scchart.mglid.mcam.modules.checks.SCChartOutgoingCheck());

		return reg;
	}

	@Override
	public MergeProcess<SCChartId, SCChartAdapter> createMergePhase(
			CompareProcess<SCChartId, SCChartAdapter> localCompare,
			CompareProcess<SCChartId, SCChartAdapter> remoteCompare,
			SCChartAdapter mergeModel) {

		MergeProcess<SCChartId, SCChartAdapter> mergeProcess = new MergeProcess<>(
				mergeModel, localCompare, remoteCompare);
		mergeProcess.setMergeStrategy(new _CincoMergeStrategy<SCChartId, SCChartAdapter>());
		return mergeProcess;
	}

}
