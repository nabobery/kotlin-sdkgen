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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dBranch {
  Branch1,
  InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e,
}

public sealed class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dNoMatchException(
  message: String,
) : InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dDecodingException(message)

internal data class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d.Serializer::class)
public class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e:
      InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e) json.decodeFromJsonElement<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dBranch.Branch1)
      if (inspection.matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e) add(InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dBranch.InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d {
      val inspection = inspectInlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dNoMatchException("InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d) {
      encoder.requireJsonEncoder("InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617d(element: JsonElement): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e = element.isJsonDecodable<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e>()
  return InlineV1CustomersBalanceTransactionsPostRequestFormMetadataXdddf617dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e = matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e) add("InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e: value does not match InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
