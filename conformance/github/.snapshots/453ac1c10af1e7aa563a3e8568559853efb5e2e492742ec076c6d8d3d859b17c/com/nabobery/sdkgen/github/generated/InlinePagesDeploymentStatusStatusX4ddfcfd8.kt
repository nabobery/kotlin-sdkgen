package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The current status of the deployment.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pages-deployment-status/properties/status
 */
@Serializable(with = InlinePagesDeploymentStatusStatusX4ddfcfd8.Serializer::class)
public sealed class InlinePagesDeploymentStatusStatusX4ddfcfd8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deployment_in_progress`.
   */
  public data object DeploymentInProgress : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_in_progress"
  }

  /**
   * Documented value. Wire value: `syncing_files`.
   */
  public data object SyncingFiles : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "syncing_files"
  }

  /**
   * Documented value. Wire value: `finished_file_sync`.
   */
  public data object FinishedFileSync : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "finished_file_sync"
  }

  /**
   * Documented value. Wire value: `updating_pages`.
   */
  public data object UpdatingPages : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "updating_pages"
  }

  /**
   * Documented value. Wire value: `purging_cdn`.
   */
  public data object PurgingCdn : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "purging_cdn"
  }

  /**
   * Documented value. Wire value: `deployment_cancelled`.
   */
  public data object DeploymentCancelled : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_cancelled"
  }

  /**
   * Documented value. Wire value: `deployment_failed`.
   */
  public data object DeploymentFailed : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_failed"
  }

  /**
   * Documented value. Wire value: `deployment_content_failed`.
   */
  public data object DeploymentContentFailed : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_content_failed"
  }

  /**
   * Documented value. Wire value: `deployment_attempt_error`.
   */
  public data object DeploymentAttemptError : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_attempt_error"
  }

  /**
   * Documented value. Wire value: `deployment_lost`.
   */
  public data object DeploymentLost : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "deployment_lost"
  }

  /**
   * Documented value. Wire value: `succeed`.
   */
  public data object Succeed : InlinePagesDeploymentStatusStatusX4ddfcfd8() {
    public override val `value`: String = "succeed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePagesDeploymentStatusStatusX4ddfcfd8()

  public companion object {
    public fun fromValue(`value`: String): InlinePagesDeploymentStatusStatusX4ddfcfd8 = when (value) {
      DeploymentInProgress.value -> DeploymentInProgress
      SyncingFiles.value -> SyncingFiles
      FinishedFileSync.value -> FinishedFileSync
      UpdatingPages.value -> UpdatingPages
      PurgingCdn.value -> PurgingCdn
      DeploymentCancelled.value -> DeploymentCancelled
      DeploymentFailed.value -> DeploymentFailed
      DeploymentContentFailed.value -> DeploymentContentFailed
      DeploymentAttemptError.value -> DeploymentAttemptError
      DeploymentLost.value -> DeploymentLost
      Succeed.value -> Succeed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePagesDeploymentStatusStatusX4ddfcfd8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePagesDeploymentStatusStatusX4ddfcfd8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePagesDeploymentStatusStatusX4ddfcfd8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePagesDeploymentStatusStatusX4ddfcfd8) {
      encoder.encodeString(value.value)
    }
  }
}
