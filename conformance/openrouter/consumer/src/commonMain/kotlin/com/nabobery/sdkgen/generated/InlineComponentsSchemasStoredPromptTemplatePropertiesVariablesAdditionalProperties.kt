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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch {
  Branch1,
  InputText,
  InputImage,
  InputFile,
}

public sealed class InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesNoMatchException(
  message: String,
) : InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesDecodingException(message)

internal data class InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesInspection(
  public val matchesBranch1: Boolean,
  public val matchesInputText: Boolean,
  public val matchesInputImage: Boolean,
  public val matchesInputFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInputText, matchesInputImage, matchesInputFile).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/StoredPromptTemplate/properties/variables/additionalProperties.
 */
@Serializable(with = InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties
  .Serializer::class)
public class InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val inputText: InputText? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputText) json
        .decodeFromJsonElement<InputText>(raw) else null }

  public val inputImage: InputImage? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputImage) json
        .decodeFromJsonElement<InputImage>(raw) else null }

  public val inputFile: InputFile? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputFile) json
        .decodeFromJsonElement<InputFile>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch>
    get() = buildSet {
      if (inspection
        .matchesBranch1) add(InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch
          .Branch1)
      if (inspection
        .matchesInputText) add(InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch
          .InputText)
      if (inspection
        .matchesInputImage) add(InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch.InputImage)
      if (inspection
        .matchesInputFile) add(InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesBranch
          .InputFile)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties {
      val inspection = inspectInlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesNoMatchException("InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties) {
      encoder.requireJsonEncoder("InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalProperties(element: JsonElement): InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInputText = element.isJsonDecodable<InputText>()
  val matchesInputImage = element.isJsonDecodable<InputImage>()
  val matchesInputFile = element.isJsonDecodable<InputFile>()
  return InlineComponentsSchemasStoredPromptTemplatePropertiesVariablesAdditionalPropertiesInspection(
    matchesBranch1 = matchesBranch1,
    matchesInputText = matchesInputText,
    matchesInputImage = matchesInputImage,
    matchesInputFile = matchesInputFile,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInputText) add("InputText: value does not match InputText")
      if (!matchesInputImage) add("InputImage: value does not match InputImage")
      if (!matchesInputFile) add("InputFile: value does not match InputFile")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
