package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Specifies which status the token should be updated to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens~1{token}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/status
 */
@Serializable(with = InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5.Serializer::class)
public sealed class InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5() {
    public override val `value`: String = "deleted"
  }

  /**
   * Documented value. Wire value: `suspended`.
   */
  public data object Suspended : InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5() {
    public override val `value`: String = "suspended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5 = when (value) {
      Active.value -> Active
      Deleted.value -> Deleted
      Suspended.value -> Suspended
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTokensPostRequestFormStatusX8c2dd5a5) {
      encoder.encodeString(value.value)
    }
  }
}
