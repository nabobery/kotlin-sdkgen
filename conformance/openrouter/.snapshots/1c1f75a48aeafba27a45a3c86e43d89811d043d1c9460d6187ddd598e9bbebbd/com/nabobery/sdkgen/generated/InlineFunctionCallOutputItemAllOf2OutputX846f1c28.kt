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

public enum class InlineFunctionCallOutputItemAllOf2OutputX846f1c28Branch {
  Branch1,
  Branch2,
}

public sealed class InlineFunctionCallOutputItemAllOf2OutputX846f1c28DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFunctionCallOutputItemAllOf2OutputX846f1c28NoMatchException(
  message: String,
) : InlineFunctionCallOutputItemAllOf2OutputX846f1c28DecodingException(message)

internal data class InlineFunctionCallOutputItemAllOf2OutputX846f1c28Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FunctionCallOutputItem/allOf/1/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FunctionCallOutputItem/allOf/1/properties/output
 */
@Serializable(with = InlineFunctionCallOutputItemAllOf2OutputX846f1c28.Serializer::class)
public class InlineFunctionCallOutputItemAllOf2OutputX846f1c28 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFunctionCallOutputItemAllOf2OutputX846f1c28Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineFunctionCallOutputItemAllOf2OutputAnyOf2ItemX736ac51f>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineFunctionCallOutputItemAllOf2OutputAnyOf2ItemX736ac51f>>(raw) else null }

  public val matchedBranches: Set<InlineFunctionCallOutputItemAllOf2OutputX846f1c28Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFunctionCallOutputItemAllOf2OutputX846f1c28Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineFunctionCallOutputItemAllOf2OutputX846f1c28Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFunctionCallOutputItemAllOf2OutputX846f1c28 {
      val inspection = inspectInlineFunctionCallOutputItemAllOf2OutputX846f1c28(raw)
      if (inspection.matchCount == 0) {
        throw InlineFunctionCallOutputItemAllOf2OutputX846f1c28NoMatchException("InlineFunctionCallOutputItemAllOf2OutputX846f1c28 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFunctionCallOutputItemAllOf2OutputX846f1c28(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFunctionCallOutputItemAllOf2OutputX846f1c28> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFunctionCallOutputItemAllOf2OutputX846f1c28 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFunctionCallOutputItemAllOf2OutputX846f1c28")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFunctionCallOutputItemAllOf2OutputX846f1c28) {
      encoder.requireJsonEncoder("InlineFunctionCallOutputItemAllOf2OutputX846f1c28").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFunctionCallOutputItemAllOf2OutputX846f1c28(element: JsonElement): InlineFunctionCallOutputItemAllOf2OutputX846f1c28Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineFunctionCallOutputItemAllOf2OutputAnyOf2ItemX736ac51f>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineFunctionCallOutputItemAllOf2OutputX846f1c28Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
