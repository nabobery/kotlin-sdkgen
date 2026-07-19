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

public sealed class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20NoMatchException(
  message: String,
) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20DecodingException(message)

public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20AmbiguityException(
  message: String,
) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1embeddings/post/requestBody/content/application~1json/schema/properties/input/a
 * nyOf/4/items/properties/content/items.
 */
@Serializable(with = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20
  .Serializer::class)
public sealed interface InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 internal constructor(
    public val text: String,
    public val type:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String,
        type: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37 = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e internal constructor(
    public val imageUrl:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0,
    public val type:
        InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(imageUrl: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0,
        type: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e = InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e(
        imageUrl = imageUrl,
        type = type,
        raw = buildJsonObject {
          put("image_url", SdkJson.encodeToJsonElement(imageUrl))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ContentPartInputAudio internal constructor(
    public val inputAudio: MultimodalMedia,
    public val type: InlineComponentsSchemasContentPartInputAudioPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputAudio: MultimodalMedia,
        type: InlineComponentsSchemasContentPartInputAudioPropertiesType): ContentPartInputAudio =
          ContentPartInputAudio(
        inputAudio = inputAudio,
        type = type,
        raw = buildJsonObject {
          put("input_audio", SdkJson.encodeToJsonElement(inputAudio))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ContentPartInputVideo internal constructor(
    public val inputVideo: MultimodalMedia,
    public val type: InlineComponentsSchemasContentPartInputVideoPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputVideo: MultimodalMedia,
        type: InlineComponentsSchemasContentPartInputVideoPropertiesType): ContentPartInputVideo =
          ContentPartInputVideo(
        inputVideo = inputVideo,
        type = type,
        raw = buildJsonObject {
          put("input_video", SdkJson.encodeToJsonElement(inputVideo))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ContentPartInputFile internal constructor(
    public val inputFile: MultimodalMedia,
    public val type: InlineComponentsSchemasContentPartInputFilePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(inputFile: MultimodalMedia,
        type: InlineComponentsSchemasContentPartInputFilePropertiesType): ContentPartInputFile = ContentPartInputFile(
        inputFile = inputFile,
        type = type,
        raw = buildJsonObject {
          put("input_file", SdkJson.encodeToJsonElement(inputFile))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20NoMatchException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20(raw)
      if (matches.size == 0) {
        throw InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20NoMatchException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20AmbiguityException("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20 " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.textDecoded && matches.typeState5Decoded ->
          InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37(text =
            requireNotNull(matches.text), type = requireNotNull(matches.typeState5), raw = raw)
        matches.imageUrlDecoded && matches.typeState4Decoded ->
          InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e(imageUrl =
            requireNotNull(matches.imageUrl), type = requireNotNull(matches.typeState4), raw = raw)
        matches.inputAudioDecoded && matches.typeState1Decoded -> ContentPartInputAudio(inputAudio =
          requireNotNull(matches.inputAudio), type = requireNotNull(matches.typeState1), raw = raw)
        matches.inputVideoDecoded && matches.typeState3Decoded -> ContentPartInputVideo(inputVideo =
          requireNotNull(matches.inputVideo), type = requireNotNull(matches.typeState3), raw = raw)
        matches.inputFileDecoded && matches.typeState2Decoded -> ContentPartInputFile(inputFile =
          requireNotNull(matches.inputFile), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20) {
      encoder
        .requireJsonEncoder("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20Inspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState5:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5?,
  public val typeState5Decoded: Boolean,
  public val imageUrl:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0?,
  public val imageUrlDecoded: Boolean,
  public val typeState4:
      InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426?,
  public val typeState4Decoded: Boolean,
  public val inputAudio: MultimodalMedia?,
  public val inputAudioDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasContentPartInputAudioPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val inputVideo: MultimodalMedia?,
  public val inputVideoDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasContentPartInputVideoPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val inputFile: MultimodalMedia?,
  public val inputFileDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasContentPartInputFilePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded &&
        typeState5Decoded) add("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37")
      if (imageUrlDecoded &&
        typeState4Decoded) add("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e")
      if (inputAudioDecoded && typeState1Decoded) add("ContentPartInputAudio")
      if (inputVideoDecoded && typeState3Decoded) add("ContentPartInputVideo")
      if (inputFileDecoded && typeState2Decoded) add("ContentPartInputFile")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20(raw: JsonObject): InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20Inspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAc13ea4d5>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val imageUrlResult = raw["image_url"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA37fb1ac0>(element) } }
  val imageUrl = imageUrlResult?.getOrNull()
  val imageUrlDecoded = imageUrlResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA5138d426>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val inputAudioResult = raw["input_audio"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<MultimodalMedia>(element) } }
  val inputAudio = inputAudioResult?.getOrNull()
  val inputAudioDecoded = inputAudioResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartInputAudioPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val inputVideoResult = raw["input_video"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<MultimodalMedia>(element) } }
  val inputVideo = inputVideoResult?.getOrNull()
  val inputVideoDecoded = inputVideoResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartInputVideoPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val inputFileResult = raw["input_file"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<MultimodalMedia>(element) } }
  val inputFile = inputFileResult?.getOrNull()
  val inputFileDecoded = inputFileResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContentPartInputFilePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  return InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputAb431cc20Inspection(
    text = text,
    textDecoded = textDecoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    imageUrl = imageUrl,
    imageUrlDecoded = imageUrlDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    inputAudio = inputAudio,
    inputAudioDecoded = inputAudioDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    inputVideo = inputVideo,
    inputVideoDecoded = inputVideoDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    inputFile = inputFile,
    inputFileDecoded = inputFileDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    failures = buildList {
      if (!textDecoded ||
        !typeState5Decoded) add("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA49123c37: " +
          "required properties 'text' and 'type' do not match their declared types")
      if (!imageUrlDecoded ||
        !typeState4Decoded) add("InlinePathsEmbeddingsPostRequestBodyContentApplicationJsonSchemaPropertiesInputA4d86112e: " +
          "required properties 'image_url' and 'type' do not match their declared types")
      if (!inputAudioDecoded ||
        !typeState1Decoded) add("ContentPartInputAudio: required properties 'input_audio' and 'type' do not match " +
          "their declared types")
      if (!inputVideoDecoded ||
        !typeState3Decoded) add("ContentPartInputVideo: required properties 'input_video' and 'type' do not match " +
          "their declared types")
      if (!inputFileDecoded ||
        !typeState2Decoded) add("ContentPartInputFile: required properties 'input_file' and 'type' do not match their " +
          "declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
