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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenFinishReasonIs/properties/type.
 */
@Serializable(with = InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `finish_reason_is`.
   */
  public data object FinishReasonIs : InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType() {
    public override val `value`: String = "finish_reason_is"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType =
      when (value) {
      FinishReasonIs.value -> FinishReasonIs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasStopServerToolsWhenFinishReasonIsPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
