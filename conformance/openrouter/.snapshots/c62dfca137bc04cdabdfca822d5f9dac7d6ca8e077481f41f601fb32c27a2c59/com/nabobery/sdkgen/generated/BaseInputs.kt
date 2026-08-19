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

public enum class BaseInputsBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class BaseInputsDecodingException(
  message: String,
) : SerializationException(message)

public class BaseInputsNoMatchException(
  message: String,
) : BaseInputsDecodingException(message)

internal data class BaseInputsInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/BaseInputs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs
 */
@Serializable(with = BaseInputs.Serializer::class)
public class BaseInputs internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: BaseInputsInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineBaseInputsAnyOf2ItemX5a05ae77>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineBaseInputsAnyOf2ItemX5a05ae77>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<BaseInputsBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(BaseInputsBranch.Branch1)
      if (inspection.matchesBranch2) add(BaseInputsBranch.Branch2)
      if (inspection.matchesBranch3) add(BaseInputsBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): BaseInputs {
      val inspection = inspectBaseInputs(raw)
      if (inspection.matchCount == 0) {
        throw BaseInputsNoMatchException("BaseInputs matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return BaseInputs(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<BaseInputs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BaseInputs {
      val jsonDecoder = decoder.requireJsonDecoder("BaseInputs")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: BaseInputs) {
      encoder.requireJsonEncoder("BaseInputs").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectBaseInputs(element: JsonElement): BaseInputsInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineBaseInputsAnyOf2ItemX5a05ae77>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return BaseInputsInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
