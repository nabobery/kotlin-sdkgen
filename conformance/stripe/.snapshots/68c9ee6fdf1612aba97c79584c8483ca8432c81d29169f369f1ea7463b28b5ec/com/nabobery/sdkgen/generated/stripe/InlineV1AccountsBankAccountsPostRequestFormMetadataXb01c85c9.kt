package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Branch {
  Branch1,
  InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49,
}

public sealed class InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9NoMatchException(
  message: String,
) : InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9DecodingException(message)

internal data class InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9.Serializer::class)
public class InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49:
      InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49) json.decodeFromJsonElement<InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Branch.Branch1)
      if (inspection.matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49) add(InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Branch.InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9 {
      val inspection = inspectInlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9NoMatchException("InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9) {
      encoder.requireJsonEncoder("InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9(element: JsonElement): InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 = element.isJsonDecodable<InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49>()
  return InlineV1AccountsBankAccountsPostRequestFormMetadataXb01c85c9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 = matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49) add("InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49: value does not match InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
