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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1received_debits/post/requestBody/content/applicatio
 * n~1x-www-form-urlencoded/schema/properties/initiating_payment_method_details/properties/type
 */
@Serializable(with = InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab.Serializer::class)
public sealed class InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `us_bank_account`.
   */
  public data object UsBankAccount : InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab() {
    public override val `value`: String = "us_bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab = when (value) {
      UsBankAccount.value -> UsBankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasurbf2dPostRequestFormTypeX7638f3ab) {
      encoder.encodeString(value.value)
    }
  }
}
