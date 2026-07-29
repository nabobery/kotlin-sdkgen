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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersPostRequestFormIndividualNameXec453fc2Branch {
  Branch1,
  InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff,
}

public sealed class InlineV1CustomersPostRequestFormIndividualNameXec453fc2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormIndividualNameXec453fc2NoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormIndividualNameXec453fc2DecodingException(message)

internal data class InlineV1CustomersPostRequestFormIndividualNameXec453fc2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff).count { it }
}

/**
 * The customer's full name. This may be up to *150 characters*.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/individual_name
 */
@Serializable(with = InlineV1CustomersPostRequestFormIndividualNameXec453fc2.Serializer::class)
public class InlineV1CustomersPostRequestFormIndividualNameXec453fc2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormIndividualNameXec453fc2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff:
      InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormIndividualNameXec453fc2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormIndividualNameXec453fc2Branch.Branch1)
      if (inspection.matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff) add(InlineV1CustomersPostRequestFormIndividualNameXec453fc2Branch.InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormIndividualNameXec453fc2 {
      val inspection = inspectInlineV1CustomersPostRequestFormIndividualNameXec453fc2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormIndividualNameXec453fc2NoMatchException("InlineV1CustomersPostRequestFormIndividualNameXec453fc2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormIndividualNameXec453fc2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormIndividualNameXec453fc2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormIndividualNameXec453fc2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormIndividualNameXec453fc2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormIndividualNameXec453fc2) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormIndividualNameXec453fc2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormIndividualNameXec453fc2(element: JsonElement): InlineV1CustomersPostRequestFormIndividualNameXec453fc2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff = element.isJsonDecodable<InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff>()
  return InlineV1CustomersPostRequestFormIndividualNameXec453fc2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff = matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff) add("InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff: value does not match InlineV1CustomersPostRequestFormIndividualNameAnyOf2Xbbe292ff")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
