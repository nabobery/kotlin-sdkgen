package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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

public enum class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Branch {
  Branch1,
  Branch2,
}

public sealed class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421NoMatchException(
  message: String,
) : InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421DecodingException(message)

internal data class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1analytics~1query/post/requestBody/content/application~1json/schema/properties/f
 * ilters/items/properties/value/anyOf/2/items.
 */
@Serializable(with = InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421
  .Serializer::class)
public class InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val matchedBranches:
      Set<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Branch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Branch.Branch1)
      if (inspection
        .matchesBranch2) add(InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421 {
      val inspection =
        inspectInlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421(raw)
      if (inspection.matchCount == 0) {
        throw InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421NoMatchException("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421 " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421) {
      encoder
        .requireJsonEncoder("InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421(element: JsonElement): InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  return InlinePathsAnalyticsQueryPostRequestBodyContentApplicationJsonSchemaPropertiesFibb7b7421Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
