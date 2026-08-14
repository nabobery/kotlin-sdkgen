package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersGetResponse200JsonX874ee250Branch {
  Customer,
  DeletedCustomer,
}

public sealed class InlineV1CustomersGetResponse200JsonX874ee250DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersGetResponse200JsonX874ee250NoMatchException(
  message: String,
) : InlineV1CustomersGetResponse200JsonX874ee250DecodingException(message)

internal data class InlineV1CustomersGetResponse200JsonX874ee250Inspection(
  public val matchesCustomer: Boolean,
  public val matchesDeletedCustomer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesCustomer, matchesDeletedCustomer).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineV1CustomersGetResponse200JsonX874ee250.Serializer::class)
public class InlineV1CustomersGetResponse200JsonX874ee250 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersGetResponse200JsonX874ee250Inspection,
) {
  public val customer: CustomerView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCustomer) json.decodeFromJsonElement<CustomerView>(raw) else null }

  public val deletedCustomer: DeletedCustomerView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCustomer) json.decodeFromJsonElement<DeletedCustomerView>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersGetResponse200JsonX874ee250Branch>
    get() = buildSet {
      if (inspection.matchesCustomer) add(InlineV1CustomersGetResponse200JsonX874ee250Branch.Customer)
      if (inspection.matchesDeletedCustomer) add(InlineV1CustomersGetResponse200JsonX874ee250Branch.DeletedCustomer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersGetResponse200JsonX874ee250 {
      val inspection = inspectInlineV1CustomersGetResponse200JsonX874ee250(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersGetResponse200JsonX874ee250NoMatchException("InlineV1CustomersGetResponse200JsonX874ee250 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersGetResponse200JsonX874ee250(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersGetResponse200JsonX874ee250> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersGetResponse200JsonX874ee250 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersGetResponse200JsonX874ee250")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersGetResponse200JsonX874ee250) {
      encoder.requireJsonEncoder("InlineV1CustomersGetResponse200JsonX874ee250").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersGetResponse200JsonX874ee250(element: JsonElement): InlineV1CustomersGetResponse200JsonX874ee250Inspection {
  val raw = element as? JsonObject ?: return InlineV1CustomersGetResponse200JsonX874ee250Inspection(
    matchesCustomer = false,
    matchesDeletedCustomer = false,
    failures = listOf("Customer: expected JSON object", "DeletedCustomer: expected JSON object"),
  )
  val matchesCustomer = raw["created"] != null && raw["id"].isString() && raw["livemode"] != null && raw["object"] != null
  val matchesDeletedCustomer = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
  return InlineV1CustomersGetResponse200JsonX874ee250Inspection(
    matchesCustomer = matchesCustomer,
    matchesDeletedCustomer = matchesDeletedCustomer,
    failures = buildList {
      if (!matchesCustomer) add("Customer: required properties 'created', 'id', 'livemode', 'object' do not match their declared types")
      if (!matchesDeletedCustomer) add("DeletedCustomer: required properties 'deleted', 'id', 'object' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
