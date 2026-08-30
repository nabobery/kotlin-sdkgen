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
 * The service tier to use for processing this request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/service_tier
 */
@Serializable(with = InlineChatRequestServiceTierX35937cb5.Serializer::class)
public sealed class InlineChatRequestServiceTierX35937cb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineChatRequestServiceTierX35937cb5() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineChatRequestServiceTierX35937cb5() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineChatRequestServiceTierX35937cb5() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineChatRequestServiceTierX35937cb5() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `scale`.
   */
  public data object Scale : InlineChatRequestServiceTierX35937cb5() {
    public override val `value`: String = "scale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatRequestServiceTierX35937cb5()

  public companion object {
    public fun fromValue(`value`: String): InlineChatRequestServiceTierX35937cb5 = when (value) {
      Auto.value -> Auto
      Default.value -> Default
      Flex.value -> Flex
      Priority.value -> Priority
      Scale.value -> Scale
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatRequestServiceTierX35937cb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatRequestServiceTierX35937cb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatRequestServiceTierX35937cb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestServiceTierX35937cb5) {
      encoder.encodeString(value.value)
    }
  }
}
