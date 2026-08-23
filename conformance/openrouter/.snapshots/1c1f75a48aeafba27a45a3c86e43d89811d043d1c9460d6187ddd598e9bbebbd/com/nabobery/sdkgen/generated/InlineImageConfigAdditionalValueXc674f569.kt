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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineImageConfigAdditionalValueXc674f569Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineImageConfigAdditionalValueXc674f569DecodingException(
  message: String,
) : SerializationException(message)

public class InlineImageConfigAdditionalValueXc674f569NoMatchException(
  message: String,
) : InlineImageConfigAdditionalValueXc674f569DecodingException(message)

internal data class InlineImageConfigAdditionalValueXc674f569Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/ImageConfig/additionalProperties.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ImageConfig/additionalProperties
 */
@Serializable(with = InlineImageConfigAdditionalValueXc674f569.Serializer::class)
public class InlineImageConfigAdditionalValueXc674f569 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineImageConfigAdditionalValueXc674f569Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: List<JsonElement?>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<List<JsonElement?>>(raw) else null }

  public val matchedBranches: Set<InlineImageConfigAdditionalValueXc674f569Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineImageConfigAdditionalValueXc674f569Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineImageConfigAdditionalValueXc674f569Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineImageConfigAdditionalValueXc674f569Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineImageConfigAdditionalValueXc674f569 {
      val inspection = inspectInlineImageConfigAdditionalValueXc674f569(raw)
      if (inspection.matchCount == 0) {
        throw InlineImageConfigAdditionalValueXc674f569NoMatchException("InlineImageConfigAdditionalValueXc674f569 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineImageConfigAdditionalValueXc674f569(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineImageConfigAdditionalValueXc674f569> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineImageConfigAdditionalValueXc674f569 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineImageConfigAdditionalValueXc674f569")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineImageConfigAdditionalValueXc674f569) {
      encoder.requireJsonEncoder("InlineImageConfigAdditionalValueXc674f569").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineImageConfigAdditionalValueXc674f569(element: JsonElement): InlineImageConfigAdditionalValueXc674f569Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<List<JsonElement?>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineImageConfigAdditionalValueXc674f569Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
