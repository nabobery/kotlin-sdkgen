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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/card/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/card/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da.Serializer::class)
public sealed class InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormCardAnyOf1ObjectValueX77f605da) {
      encoder.encodeString(value.value)
    }
  }
}
