package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsDecodingException(message)

public class InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/output/anyOf/1/items
 * .
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items
  .Serializer::class)
public sealed interface InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InputText internal constructor(
    public val text: String,
    public val type: InlineComponentsSchemasInputTextPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineComponentsSchemasInputTextPropertiesType): InputText = InputText(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", "input_text")
        },
      )
    }
  }

  public class InputImage internal constructor(
    public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
    public val type: InlineComponentsSchemasInputImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(detail: InlineComponentsSchemasInputImagePropertiesDetail,
        type: InlineComponentsSchemasInputImagePropertiesType): InputImage = InputImage(
        detail = detail,
        type = type,
        raw = buildJsonObject {
          put("detail", SdkJson.encodeToJsonElement(detail))
          put("type", "input_image")
        },
      )
    }
  }

  public class InputFile internal constructor(
    public val type: InlineComponentsSchemasInputFilePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasInputFilePropertiesType): InputFile = InputFile(
        type = type,
        raw = buildJsonObject {
          put("type", "input_file")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsNoMatchException("InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsNoMatchException("InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsAmbiguityException("InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState3Matches && matches.textDecoded -> InputText(text = requireNotNull(matches.text), type =
          requireNotNull(matches.typeState3), raw = raw)
        matches.typeState2Matches && matches.detailDecoded -> InputImage(detail = requireNotNull(matches.detail),
          type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches -> InputFile(type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsInspection(
  public val typeState3: InlineComponentsSchemasInputTextPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasInputImagePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail?,
  public val detailDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasInputFilePropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState3Matches && textDecoded) add("InputText")
      if (typeState2Matches && detailDecoded) add("InputImage")
      if (typeState1Matches) add("InputFile")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1Items(raw: JsonObject): InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsInspection {
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputTextPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "input_text" && typeState3Decoded
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "input_image" && typeState2Decoded
  val detailResult = raw["detail"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesDetail>(element) } }
  val detail = detailResult?.getOrNull()
  val detailDecoded = detailResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputFilePropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "input_file" && typeState1Decoded
  return InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesOutputAnyOf1ItemsInspection(
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    text = text,
    textDecoded = textDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    detail = detail,
    detailDecoded = detailDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    failures = buildList {
      if (!typeState3Matches ||
        !textDecoded) add("InputText: required properties 'type' and 'text' do not match their declared types")
      if (!typeState2Matches ||
        !detailDecoded) add("InputImage: required properties 'type' and 'detail' do not match their declared types")
      if (!typeState1Matches) add("InputFile: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
