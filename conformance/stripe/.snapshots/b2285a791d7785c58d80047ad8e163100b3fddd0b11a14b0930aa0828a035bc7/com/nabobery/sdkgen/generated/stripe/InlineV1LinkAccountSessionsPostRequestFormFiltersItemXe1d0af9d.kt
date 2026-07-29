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
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/filters/properties/account_subcategories/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1link_account_sessions/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/filters/properties/account_subcategories/items
 */
@Serializable(with = InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d.Serializer::class)
public sealed class InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `credit_card`.
   */
  public data object CreditCard : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d() {
    public override val `value`: String = "credit_card"
  }

  /**
   * Documented value. Wire value: `line_of_credit`.
   */
  public data object LineOfCredit : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d() {
    public override val `value`: String = "line_of_credit"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d = when (value) {
      Checking.value -> Checking
      CreditCard.value -> CreditCard
      LineOfCredit.value -> LineOfCredit
      Mortgage.value -> Mortgage
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1LinkAccountSessionsPostRequestFormFiltersItemXe1d0af9d) {
      encoder.encodeString(value.value)
    }
  }
}
