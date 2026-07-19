package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem/properties/status.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus() {
    public override val `value`: String = "failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus =
      when (value) {
      Completed.value -> Completed
      Failed.value -> Failed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasApplyPatchCallOutputItemPropertiesStatus) {
      encoder.encodeString(value.value)
    }
  }
}
