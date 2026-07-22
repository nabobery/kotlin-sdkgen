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

public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsDecodingException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * .
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems
  .Serializer::class)
public sealed interface InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 internal constructor(
    public val type:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346 = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75 internal constructor(
    public val type:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75 = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777 internal constructor(
    public val type:
        InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777 = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsAmbiguityException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState3Decoded ->
          InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346(type =
            requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Decoded ->
          InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75(type =
            requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Decoded ->
          InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777(type =
            requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsInspection(
  public val typeState3:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4?,
  public val typeState3Decoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82?,
  public val typeState1Decoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478?,
  public val typeState2Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346")
      if (typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75")
      if (typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItems(raw: JsonObject): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsInspection {
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsad9edda4>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits6dec7c82>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits7840e478>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsItemsInspection(
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    failures = buildList {
      if (!typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits5d029346: " +
        "required properties 'type' do not match their declared types")
      if (!typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEditsb1768d75: " +
        "required properties 'type' do not match their declared types")
      if (!typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9465e777: " +
        "required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
