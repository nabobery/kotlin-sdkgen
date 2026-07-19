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

public enum class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1NoMatchException(
  message: String,
) : InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1DecodingException(message)

internal data class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val matchesBranch5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4, matchesBranch5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items/properties/parameters/additional
 * Properties/anyOf/5/additionalProperties.
 */
@Serializable(with = InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1
  .Serializer::class)
public class InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Inspection,
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

  public val branch5: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesBranch1) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch.Branch1)
      if (inspection
























































                                                                                                                        .matchesBranch2) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch.Branch2)
      if (inspection
























































                                                                                                                        .matchesBranch3) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch.Branch3)
      if (inspection
























































                                                                                                                        .matchesBranch4) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch.Branch4)
      if (inspection
























































                                                                                                                        .matchesBranch5) add(InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Branch.Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1 {
      val inspection =
        inspectInlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1NoMatchException("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1 " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1(raw, json,
        inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1")
          .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1(element: JsonElement): InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement?>()
  val matchesBranch5 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasFusionPluginPropertiesToolsItemsPropertiesParametersAddit184c0fd1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Boolean")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
      if (!matchesBranch5) add("Branch5: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
