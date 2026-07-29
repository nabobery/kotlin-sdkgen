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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/properties/jurisdict
 * ion_level.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/properties/jurisdict
 * ion_level
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729.Serializer::class)
public sealed class InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `city`.
   */
  public data object City : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "city"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "country"
  }

  /**
   * Documented value. Wire value: `county`.
   */
  public data object County : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "county"
  }

  /**
   * Documented value. Wire value: `district`.
   */
  public data object District : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "district"
  }

  /**
   * Documented value. Wire value: `multiple`.
   */
  public data object Multiple : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "multiple"
  }

  /**
   * Documented value. Wire value: `state`.
   */
  public data object State : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729() {
    public override val `value`: String = "state"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729 = when (value) {
      City.value -> City
      Country.value -> Country
      County.value -> County
      District.value -> District
      Multiple.value -> Multiple
      State.value -> State
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesLinesPostRequestFormTaxAmountsAnyOf1JurisdictionLevelXd6b8b729) {
      encoder.encodeString(value.value)
    }
  }
}
