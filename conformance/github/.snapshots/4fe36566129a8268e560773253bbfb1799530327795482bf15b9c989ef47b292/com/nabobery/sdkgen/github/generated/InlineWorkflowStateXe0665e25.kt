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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/workflow/properties/state.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/workflow/properties/state
 */
@Serializable(with = InlineWorkflowStateXe0665e25.Serializer::class)
public sealed class InlineWorkflowStateXe0665e25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineWorkflowStateXe0665e25() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWorkflowStateXe0665e25() {
    public override val `value`: String = "deleted"
  }

  /**
   * Documented value. Wire value: `disabled_fork`.
   */
  public data object DisabledFork : InlineWorkflowStateXe0665e25() {
    public override val `value`: String = "disabled_fork"
  }

  /**
   * Documented value. Wire value: `disabled_inactivity`.
   */
  public data object DisabledInactivity : InlineWorkflowStateXe0665e25() {
    public override val `value`: String = "disabled_inactivity"
  }

  /**
   * Documented value. Wire value: `disabled_manually`.
   */
  public data object DisabledManually : InlineWorkflowStateXe0665e25() {
    public override val `value`: String = "disabled_manually"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWorkflowStateXe0665e25()

  public companion object {
    public fun fromValue(`value`: String): InlineWorkflowStateXe0665e25 = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      DisabledFork.value -> DisabledFork
      DisabledInactivity.value -> DisabledInactivity
      DisabledManually.value -> DisabledManually
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWorkflowStateXe0665e25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWorkflowStateXe0665e25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWorkflowStateXe0665e25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWorkflowStateXe0665e25) {
      encoder.encodeString(value.value)
    }
  }
}
