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
 * Whether authorizations can be approved on this card. May be blocked from activating cards depending on past-due
 * Cardholder requirements. Defaults to `inactive`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/status
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormStatusXe8004f74.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormStatusXe8004f74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingCardsPostRequestFormStatusXe8004f74() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineV1IssuingCardsPostRequestFormStatusXe8004f74() {
    public override val `value`: String = "inactive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormStatusXe8004f74()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormStatusXe8004f74 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormStatusXe8004f74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormStatusXe8004f74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormStatusXe8004f74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormStatusXe8004f74) {
      encoder.encodeString(value.value)
    }
  }
}
