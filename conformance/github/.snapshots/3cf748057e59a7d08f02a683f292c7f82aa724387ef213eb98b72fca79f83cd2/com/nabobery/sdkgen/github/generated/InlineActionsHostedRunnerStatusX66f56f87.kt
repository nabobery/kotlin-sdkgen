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
 * The status of the runner.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner/properties/status
 */
@Serializable(with = InlineActionsHostedRunnerStatusX66f56f87.Serializer::class)
public sealed class InlineActionsHostedRunnerStatusX66f56f87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Ready`.
   */
  public data object Ready : InlineActionsHostedRunnerStatusX66f56f87() {
    public override val `value`: String = "Ready"
  }

  /**
   * Documented value. Wire value: `Provisioning`.
   */
  public data object Provisioning : InlineActionsHostedRunnerStatusX66f56f87() {
    public override val `value`: String = "Provisioning"
  }

  /**
   * Documented value. Wire value: `Shutdown`.
   */
  public data object Shutdown : InlineActionsHostedRunnerStatusX66f56f87() {
    public override val `value`: String = "Shutdown"
  }

  /**
   * Documented value. Wire value: `Deleting`.
   */
  public data object Deleting : InlineActionsHostedRunnerStatusX66f56f87() {
    public override val `value`: String = "Deleting"
  }

  /**
   * Documented value. Wire value: `Stuck`.
   */
  public data object Stuck : InlineActionsHostedRunnerStatusX66f56f87() {
    public override val `value`: String = "Stuck"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineActionsHostedRunnerStatusX66f56f87()

  public companion object {
    public fun fromValue(`value`: String): InlineActionsHostedRunnerStatusX66f56f87 = when (value) {
      Ready.value -> Ready
      Provisioning.value -> Provisioning
      Shutdown.value -> Shutdown
      Deleting.value -> Deleting
      Stuck.value -> Stuck
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineActionsHostedRunnerStatusX66f56f87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineActionsHostedRunnerStatusX66f56f87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineActionsHostedRunnerStatusX66f56f87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineActionsHostedRunnerStatusX66f56f87) {
      encoder.encodeString(value.value)
    }
  }
}
