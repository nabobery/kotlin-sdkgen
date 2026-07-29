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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/proper
 * ties/jurisdiction_level.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/tax_amounts/anyOf/0/items/properties/tax_rate_data/proper
 * ties/jurisdiction_level
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214.Serializer::class)
public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `city`.
   */
  public data object City : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "city"
  }

  /**
   * Documented value. Wire value: `country`.
   */
  public data object Country : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "country"
  }

  /**
   * Documented value. Wire value: `county`.
   */
  public data object County : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "county"
  }

  /**
   * Documented value. Wire value: `district`.
   */
  public data object District : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "district"
  }

  /**
   * Documented value. Wire value: `multiple`.
   */
  public data object Multiple : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "multiple"
  }

  /**
   * Documented value. Wire value: `state`.
   */
  public data object State : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214() {
    public override val `value`: String = "state"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214 = when (value) {
      City.value -> City
      Country.value -> Country
      County.value -> County
      District.value -> District
      Multiple.value -> Multiple
      State.value -> State
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemJurisdictionLevelX8ff93214) {
      encoder.encodeString(value.value)
    }
  }
}
