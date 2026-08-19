package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eBranch {
  Branch1,
  Branch2,
}

public sealed class InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eNoMatchException(
  message: String,
) : InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eDecodingException(message)

internal data class InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/content
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e.Serializer::class)
public class InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eInspection,
) {
  public val branch1: List<InlineBaseInputsAnyOf2ItemAnyOf1ContentAnyOf1ItemXb1a7a236>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineBaseInputsAnyOf2ItemAnyOf1ContentAnyOf1ItemXb1a7a236>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e {
      val inspection = inspectInlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e(raw)
      if (inspection.matchCount == 0) {
        throw InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eNoMatchException("InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e) {
      encoder.requireJsonEncoder("InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697e(element: JsonElement): InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineBaseInputsAnyOf2ItemAnyOf1ContentAnyOf1ItemXb1a7a236>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineBaseInputsAnyOf2ItemAnyOf1ContentXc338697eInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
