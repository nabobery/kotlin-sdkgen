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
 * sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts~1{account}~1refresh/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema/properties/features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1linked_accounts~1{account}~1refresh/post/requestBody/content/application~1x
 * -www-form-urlencoded/schema/properties/features/items
 */
@Serializable(with = InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb.Serializer::class)
public sealed class InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balance`.
   */
  public data object Balance : InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb() {
    public override val `value`: String = "balance"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb = when (value) {
      Balance.value -> Balance
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkedAccountsRefreshPostRequestFormFeaturesItemX8b872abb) {
      encoder.encodeString(value.value)
    }
  }
}
