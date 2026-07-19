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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
  Branch6,
  Branch7,
}

public sealed class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30DecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30NoMatchException(
  message: String,
) : InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30DecodingException(message)

internal data class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val matchesBranch5: Boolean,
  public val matchesBranch6: Boolean,
  public val matchesBranch7: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4, matchesBranch5, matchesBranch6,
      matchesBranch7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items/properties/parameters/additional
 * Properties.
 */
@Serializable(with = InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30
  .Serializer::class)
public class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<Boolean>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val branch5:
      List<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit7177d398?>?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json
























































                                                                                                                        .decodeFromJsonElement<List<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit7177d398?>>(raw) else null }

  public val branch6: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch6) json
        .decodeFromJsonElement<JsonObject>(raw) else null }

  public val branch7: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch7) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch1)
      if (inspection
























































                                                                                                                        .matchesBranch2) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch2)
      if (inspection
























































                                                                                                                        .matchesBranch3) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch3)
      if (inspection
























































                                                                                                                        .matchesBranch4) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch4)
      if (inspection
























































                                                                                                                        .matchesBranch5) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch5)
      if (inspection
























































                                                                                                                        .matchesBranch6) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch6)
      if (inspection
























































                                                                                                                        .matchesBranch7) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Branch.Branch7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30 {
      val inspection =
        inspectInlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30NoMatchException("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30 " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30(element: JsonElement): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement?>()
  val matchesBranch5 = element


























































                                                                                                                        .isJsonDecodable<List<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit7177d398?>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch6 = element.isJsonDecodable<JsonObject>()
  val matchesBranch7 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAdditca8bae30Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    matchesBranch6 = matchesBranch6,
    matchesBranch7 = matchesBranch7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Boolean")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
      if (!matchesBranch5) add("Branch5: value does not match List")
      if (!matchesBranch6) add("Branch6: value does not match JsonObject")
      if (!matchesBranch7) add("Branch7: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
