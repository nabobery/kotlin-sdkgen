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

public sealed class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasAgentMessageItemPropertiesContentItemsDecodingException(message)

public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasAgentMessageItemPropertiesContentItemsDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AgentMessageItem/properties/content/items.
 */
@Serializable(with = InlineComponentsSchemasAgentMessageItemPropertiesContentItems.Serializer::class)
public sealed interface InlineComponentsSchemasAgentMessageItemPropertiesContentItems {
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
  ) : InlineComponentsSchemasAgentMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineComponentsSchemasInputTextPropertiesType): InputText = InputText(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 internal constructor(
    public val detail: InlineComponentsSchemasInputImagePropertiesDetail,
    public val type: InlineComponentsSchemasInputImagePropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAgentMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(detail: InlineComponentsSchemasInputImagePropertiesDetail,
        type: InlineComponentsSchemasInputImagePropertiesType): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1 = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(
        detail = detail,
        type = type,
        raw = buildJsonObject {
          put("detail", SdkJson.encodeToJsonElement(detail))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 internal constructor(
    public val encryptedContent: String,
    public val type:
        InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAgentMessageItemPropertiesContentItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(encryptedContent: String,
        type: InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2 = InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(
        encryptedContent = encryptedContent,
        type = type,
        raw = buildJsonObject {
          put("encrypted_content", encryptedContent)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAgentMessageItemPropertiesContentItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAgentMessageItemPropertiesContentItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasAgentMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasAgentMessageItemPropertiesContentItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasAgentMessageItemPropertiesContentItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasAgentMessageItemPropertiesContentItemsNoMatchException("InlineComponentsSchemasAgentMessageItemPropertiesContentItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasAgentMessageItemPropertiesContentItemsAmbiguityException("InlineComponentsSchemasAgentMessageItemPropertiesContentItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.textDecoded && matches.typeState3Decoded -> InputText(text = requireNotNull(matches.text), type =
          requireNotNull(matches.typeState3), raw = raw)
        matches.detailDecoded && matches.typeState2Decoded ->
          InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1(detail = requireNotNull(matches.detail),
            type = requireNotNull(matches.typeState2), raw = raw)
        matches.encryptedContentDecoded && matches.typeState1Decoded ->
          InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2(encryptedContent = requireNotNull(matches
            .encryptedContent), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAgentMessageItemPropertiesContentItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasAgentMessageItemPropertiesContentItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasAgentMessageItemPropertiesContentItemsInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasInputTextPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val detail: InlineComponentsSchemasInputImagePropertiesDetail?,
  public val detailDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasInputImagePropertiesType?,
  public val typeState2Decoded: Boolean,
  public val encryptedContent: String?,
  public val encryptedContentDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType?,
  public val typeState1Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded && typeState3Decoded) add("InputText")
      if (detailDecoded && typeState2Decoded) add("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1")
      if (encryptedContentDecoded &&
        typeState1Decoded) add("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasAgentMessageItemPropertiesContentItems(raw: JsonObject): InlineComponentsSchemasAgentMessageItemPropertiesContentItemsInspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputTextPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val detailResult = raw["detail"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesDetail>(element) } }
  val detail = detailResult?.getOrNull()
  val detailDecoded = detailResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasInputImagePropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val encryptedContentResult = raw["encrypted_content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val encryptedContent = encryptedContentResult?.getOrNull()
  val encryptedContentDecoded = encryptedContentResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2PropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  return InlineComponentsSchemasAgentMessageItemPropertiesContentItemsInspection(
    text = text,
    textDecoded = textDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    detail = detail,
    detailDecoded = detailDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    encryptedContent = encryptedContent,
    encryptedContentDecoded = encryptedContentDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    failures = buildList {
      if (!textDecoded ||
        !typeState3Decoded) add("InputText: required properties 'text' and 'type' do not match their declared types")
      if (!detailDecoded ||
        !typeState2Decoded) add("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf1: required " +
          "properties 'detail' and 'type' do not match their declared types")
      if (!encryptedContentDecoded ||
        !typeState1Decoded) add("InlineComponentsSchemasAgentMessageItemPropertiesContentItemsOneOf2: required " +
          "properties 'encrypted_content' and 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
