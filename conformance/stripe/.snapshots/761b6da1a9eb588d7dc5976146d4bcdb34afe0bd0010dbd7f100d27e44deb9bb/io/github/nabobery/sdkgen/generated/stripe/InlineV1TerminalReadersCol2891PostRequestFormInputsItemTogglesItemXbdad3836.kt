package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/toggles/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items/properties/toggles/items
 */
@Serializable(with = InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836.Serializer::class)
public class InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836(
  public val defaultValue:
      InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c? = null,
  public val description: String? = null,
  public val title: String? = null,
) {
  public class Builder {
    public var defaultValue:
        InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c? = null

    public var description: String? = null

    public var title: String? = null

    public fun build(): InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836 = InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836(
      defaultValue = defaultValue,
      description = description,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836 must be a JSON object")
      return InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836(
        defaultValue = rawObject["default_value"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersCol2891PostRequestFormInputsItemDefaultValueX2754d54c>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultValue?.let { put("default_value", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836(block: InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836.Builder.() -> Unit): InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836 = InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836.build(block)
