package io.github.nabobery.sdkgen.generated

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

public enum class InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch {
  Branch1,
  InputText,
  InputImage,
  InputFile,
}

public sealed class InlineStoredPromptTemplateVariablesAdditionalValueX258ee251DecodingException(
  message: String,
) : SerializationException(message)

public class InlineStoredPromptTemplateVariablesAdditionalValueX258ee251NoMatchException(
  message: String,
) : InlineStoredPromptTemplateVariablesAdditionalValueX258ee251DecodingException(message)

internal data class InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Inspection(
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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/StoredPromptTemplate/properties/variables/additionalProperties
 */
@Serializable(with = InlineStoredPromptTemplateVariablesAdditionalValueX258ee251.Serializer::class)
public class InlineStoredPromptTemplateVariablesAdditionalValueX258ee251 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inputText: InputText? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputText) json.decodeFromJsonElement<InputText>(raw) else null }

  public val inputImage: InputImage? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputImage) json.decodeFromJsonElement<InputImage>(raw) else null }

  public val inputFile: InputFile? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInputFile) json.decodeFromJsonElement<InputFile>(raw) else null }

  public val matchedBranches: Set<InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch.Branch1)
      if (inspection.matchesInputText) add(InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch.InputText)
      if (inspection.matchesInputImage) add(InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch.InputImage)
      if (inspection.matchesInputFile) add(InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Branch.InputFile)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineStoredPromptTemplateVariablesAdditionalValueX258ee251 {
      val inspection = inspectInlineStoredPromptTemplateVariablesAdditionalValueX258ee251(raw)
      if (inspection.matchCount == 0) {
        throw InlineStoredPromptTemplateVariablesAdditionalValueX258ee251NoMatchException("InlineStoredPromptTemplateVariablesAdditionalValueX258ee251 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineStoredPromptTemplateVariablesAdditionalValueX258ee251(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineStoredPromptTemplateVariablesAdditionalValueX258ee251> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineStoredPromptTemplateVariablesAdditionalValueX258ee251 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineStoredPromptTemplateVariablesAdditionalValueX258ee251")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineStoredPromptTemplateVariablesAdditionalValueX258ee251) {
      encoder.requireJsonEncoder("InlineStoredPromptTemplateVariablesAdditionalValueX258ee251").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineStoredPromptTemplateVariablesAdditionalValueX258ee251(element: JsonElement): InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInputText = element.isJsonDecodable<InputText>()
  val matchesInputImage = element.isJsonDecodable<InputImage>()
  val matchesInputFile = element.isJsonDecodable<InputFile>()
  return InlineStoredPromptTemplateVariablesAdditionalValueX258ee251Inspection(
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
