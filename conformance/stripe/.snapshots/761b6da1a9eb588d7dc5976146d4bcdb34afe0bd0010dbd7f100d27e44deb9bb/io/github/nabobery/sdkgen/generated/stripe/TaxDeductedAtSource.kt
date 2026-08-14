package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class TaxDeductedAtSourceView(
  public val id: String,
  @SerialName("object")
  public val objectValue: InlineTaxDeductedAtSourceObjectValueX7029309a,
  @SerialName("period_end")
  public val periodEnd: Int,
  @SerialName("period_start")
  public val periodStart: Int,
  @SerialName("tax_deduction_account_number")
  public val taxDeductionAccountNumber: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_deducted_at_source
 */
@Serializable(with = TaxDeductedAtSource.Serializer::class)
public class TaxDeductedAtSource(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTaxDeductedAtSourceObjectValueX7029309a,
  /**
   * The end of the invoicing period. This TDS applies to Stripe fees collected during this invoicing period.
   */
  public val periodEnd: Int,
  /**
   * The start of the invoicing period. This TDS applies to Stripe fees collected during this invoicing period.
   */
  public val periodStart: Int,
  /**
   * The TAN that was supplied to Stripe when TDS was assessed
   */
  public val taxDeductionAccountNumber: String,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlineTaxDeductedAtSourceObjectValueX7029309a? = null

    public var objectValue: InlineTaxDeductedAtSourceObjectValueX7029309a
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var periodEndValue: Int? = null

    public var periodEnd: Int
      get() = requireNotNull(periodEndValue) { "periodEnd is required" }
      set(`value`) {
        periodEndValue = value
      }

    private var periodStartValue: Int? = null

    public var periodStart: Int
      get() = requireNotNull(periodStartValue) { "periodStart is required" }
      set(`value`) {
        periodStartValue = value
      }

    private var taxDeductionAccountNumberValue: String? = null

    public var taxDeductionAccountNumber: String
      get() = requireNotNull(taxDeductionAccountNumberValue) { "taxDeductionAccountNumber is required" }
      set(`value`) {
        taxDeductionAccountNumberValue = value
      }

    public fun build(): TaxDeductedAtSource {
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(periodEndValue != null) { "periodEnd is required" }
      check(periodStartValue != null) { "periodStart is required" }
      check(taxDeductionAccountNumberValue != null) { "taxDeductionAccountNumber is required" }
      return TaxDeductedAtSource(
        id = id,
        objectValue = objectValue,
        periodEnd = periodEnd,
        periodStart = periodStart,
        taxDeductionAccountNumber = taxDeductionAccountNumber,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxDeductedAtSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxDeductedAtSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxDeductedAtSource {
      val jsonDecoder = decoder.requireJsonDecoder("TaxDeductedAtSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxDeductedAtSource must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlineTaxDeductedAtSourceObjectValueX7029309a>(rawObject, "object")
      val periodEnd = json.decodeRequired<Int>(rawObject, "period_end")
      val periodStart = json.decodeRequired<Int>(rawObject, "period_start")
      val taxDeductionAccountNumber = json.decodeRequired<String>(rawObject, "tax_deduction_account_number")
      return TaxDeductedAtSource(
        id = id,
        objectValue = objectValue,
        periodEnd = periodEnd,
        periodStart = periodStart,
        taxDeductionAccountNumber = taxDeductionAccountNumber,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxDeductedAtSource) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxDeductedAtSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("period_end", json.encodeToJsonElement(value.periodEnd))
        put("period_start", json.encodeToJsonElement(value.periodStart))
        put("tax_deduction_account_number", value.taxDeductionAccountNumber)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxDeductedAtSource(block: TaxDeductedAtSource.Builder.() -> Unit): TaxDeductedAtSource = TaxDeductedAtSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxDeductedAtSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
