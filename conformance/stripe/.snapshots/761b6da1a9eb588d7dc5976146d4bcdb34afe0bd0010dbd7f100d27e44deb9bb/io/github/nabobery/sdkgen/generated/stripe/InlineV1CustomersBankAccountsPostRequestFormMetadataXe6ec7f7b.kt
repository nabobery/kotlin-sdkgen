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

public enum class InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bBranch {
  Branch1,
  InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c,
}

public sealed class InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bNoMatchException(
  message: String,
) : InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bDecodingException(message)

internal data class InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts~1{id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b.Serializer::class)
public class InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c:
      InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c) json.decodeFromJsonElement<InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bBranch.Branch1)
      if (inspection.matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c) add(InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bBranch.InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b {
      val inspection = inspectInlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bNoMatchException("InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b) {
      encoder.requireJsonEncoder("InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7b(element: JsonElement): InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c = element.isJsonDecodable<InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c>()
  return InlineV1CustomersBankAccountsPostRequestFormMetadataXe6ec7f7bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c = matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c) add("InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c: value does not match InlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
