package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_from_calculation/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_from_calculation/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1.Serializer::class)
public class InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1(
  /**
   * Tax Calculation ID to be used as input when creating the transaction.
   */
  public val calculation: String,
  /**
   * A custom order or sale identifier, such as 'myOrder_123'. Must be unique across all transactions, including
   * reversals.
   */
  public val reference: String,
  expand: List<String>? = null,
  metadata: Map<String, String>? = null,
  /**
   * The Unix timestamp representing when the tax liability is assumed or reduced, which determines the liability
   * posting period and handling in tax liability reports. The timestamp must fall within the `tax_date` and the current
   * time, unless the `tax_date` is scheduled in advance. Defaults to the current time.
   */
  public val postedAt: Int? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var calculationValue: String? = null

    public var calculation: String
      get() = requireNotNull(calculationValue) { "calculation is required" }
      set(`value`) {
        calculationValue = value
      }

    private var referenceValue: String? = null

    public var reference: String
      get() = requireNotNull(referenceValue) { "reference is required" }
      set(`value`) {
        referenceValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The Unix timestamp representing when the tax liability is assumed or reduced, which determines the liability
     * posting period and handling in tax liability reports. The timestamp must fall within the `tax_date` and the
     * current time, unless the `tax_date` is scheduled in advance. Defaults to the current time.
     */
    public var postedAt: Int? = null

    public fun build(): InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 {
      check(calculationValue != null) { "calculation is required" }
      check(referenceValue != null) { "reference is required" }
      return InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1(
        calculation = calculation,
        reference = reference,
        expand = expand,
        metadata = metadata,
        postedAt = postedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 must be a JSON object")
      val calculation = json.decodeRequired<String>(rawObject, "calculation")
      val reference = json.decodeRequired<String>(rawObject, "reference")
      return InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1(
        calculation = calculation,
        reference = reference,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        postedAt = rawObject["posted_at"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("calculation", value.calculation)
        put("reference", value.reference)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.postedAt?.let { put("posted_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1(block: InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1.Builder.() -> Unit): InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 = InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
