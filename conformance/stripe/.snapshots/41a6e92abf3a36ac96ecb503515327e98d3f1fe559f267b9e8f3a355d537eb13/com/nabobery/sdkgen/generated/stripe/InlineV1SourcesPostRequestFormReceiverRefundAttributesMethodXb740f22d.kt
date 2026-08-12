package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/receiver/properties/refund_attributes_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/receiver/properties/refund_attributes_method
 */
@Serializable(with = InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `email`.
   */
  public data object Email : InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d() {
    public override val `value`: String = "email"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d = when (value) {
      Email.value -> Email
      Manual.value -> Manual
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormReceiverRefundAttributesMethodXb740f22d) {
      encoder.encodeString(value.value)
    }
  }
}
