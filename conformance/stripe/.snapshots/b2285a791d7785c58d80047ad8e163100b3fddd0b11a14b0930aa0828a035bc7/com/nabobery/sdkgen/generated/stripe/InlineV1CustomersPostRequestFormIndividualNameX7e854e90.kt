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

public enum class InlineV1CustomersPostRequestFormIndividualNameX7e854e90Branch {
  Branch1,
  InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21,
}

public sealed class InlineV1CustomersPostRequestFormIndividualNameX7e854e90DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormIndividualNameX7e854e90NoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormIndividualNameX7e854e90DecodingException(message)

internal data class InlineV1CustomersPostRequestFormIndividualNameX7e854e90Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21).count { it }
}

/**
 * The customer's full name. This may be up to *150 characters*.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers/post/requestBody/content/application~1x-www-form-urlencoded/schem
 * a/properties/individual_name
 */
@Serializable(with = InlineV1CustomersPostRequestFormIndividualNameX7e854e90.Serializer::class)
public class InlineV1CustomersPostRequestFormIndividualNameX7e854e90 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormIndividualNameX7e854e90Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21:
      InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormIndividualNameX7e854e90Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersPostRequestFormIndividualNameX7e854e90Branch.Branch1)
      if (inspection.matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21) add(InlineV1CustomersPostRequestFormIndividualNameX7e854e90Branch.InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormIndividualNameX7e854e90 {
      val inspection = inspectInlineV1CustomersPostRequestFormIndividualNameX7e854e90(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormIndividualNameX7e854e90NoMatchException("InlineV1CustomersPostRequestFormIndividualNameX7e854e90 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormIndividualNameX7e854e90(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormIndividualNameX7e854e90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormIndividualNameX7e854e90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormIndividualNameX7e854e90")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormIndividualNameX7e854e90) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormIndividualNameX7e854e90").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormIndividualNameX7e854e90(element: JsonElement): InlineV1CustomersPostRequestFormIndividualNameX7e854e90Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21 = element.isJsonDecodable<InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21>()
  return InlineV1CustomersPostRequestFormIndividualNameX7e854e90Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21 = matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21) add("InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21: value does not match InlineV1CustomersPostRequestFormIndividualNameAnyOf2X041c1d21")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
