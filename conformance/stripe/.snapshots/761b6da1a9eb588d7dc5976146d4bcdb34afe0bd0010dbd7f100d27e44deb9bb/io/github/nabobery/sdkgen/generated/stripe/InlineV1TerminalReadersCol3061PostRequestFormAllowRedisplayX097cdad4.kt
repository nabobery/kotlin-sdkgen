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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/collect_config/properties/allow_redisplay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema/properties/collect_config/properties/allow_redisplay
 */
@Serializable(with = InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4.Serializer::class)
public sealed class InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCol3061PostRequestFormAllowRedisplayX097cdad4) {
      encoder.encodeString(value.value)
    }
  }
}
