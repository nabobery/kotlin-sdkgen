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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0/properties/networks/properties/preferred.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/card/anyOf/0/properties/networks/properties/preferred
 */
@Serializable(with = InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d.Serializer::class)
public sealed class InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d = when (value) {
      CartesBancaires.value -> CartesBancaires
      Mastercard.value -> Mastercard
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormCardAnyOf1NetworksPreferredX88e3ea6d) {
      encoder.encodeString(value.value)
    }
  }
}
