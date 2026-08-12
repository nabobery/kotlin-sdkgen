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
 * sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/service_tier.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/service_tier
 */
@Serializable(with = InlineResponsesRequestServiceTierXb8f56617.Serializer::class)
public sealed class InlineResponsesRequestServiceTierXb8f56617 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineResponsesRequestServiceTierXb8f56617() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineResponsesRequestServiceTierXb8f56617() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `flex`.
   */
  public data object Flex : InlineResponsesRequestServiceTierXb8f56617() {
    public override val `value`: String = "flex"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineResponsesRequestServiceTierXb8f56617() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `scale`.
   */
  public data object Scale : InlineResponsesRequestServiceTierXb8f56617() {
    public override val `value`: String = "scale"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineResponsesRequestServiceTierXb8f56617()

  public companion object {
    public fun fromValue(`value`: String): InlineResponsesRequestServiceTierXb8f56617 = when (value) {
      Auto.value -> Auto
      Default.value -> Default
      Flex.value -> Flex
      Priority.value -> Priority
      Scale.value -> Scale
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineResponsesRequestServiceTierXb8f56617> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineResponsesRequestServiceTierXb8f56617", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineResponsesRequestServiceTierXb8f56617 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineResponsesRequestServiceTierXb8f56617) {
      encoder.encodeString(value.value)
    }
  }
}
