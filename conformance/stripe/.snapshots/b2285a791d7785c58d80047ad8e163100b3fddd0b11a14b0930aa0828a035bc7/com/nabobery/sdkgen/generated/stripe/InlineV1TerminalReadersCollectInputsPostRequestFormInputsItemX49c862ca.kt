package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_inputs/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/inputs/items
 */
@Serializable(with = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca.Serializer::class)
public class InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca(
  public val customText:
      InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768,
  public val type: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726,
  public val required: Boolean? = null,
  public val selection:
      InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2? = null,
  toggles: List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836>? = null,
) {
  public val toggles:
      List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836>? =
      toggles?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var customTextValue:
        InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768? = null

    public var customText:
        InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768
      get() = requireNotNull(customTextValue) { "customText is required" }
      set(`value`) {
        customTextValue = value
      }

    private var typeValue:
        InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726? = null

    public var type: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var required: Boolean? = null

    public var selection:
        InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2? = null

    private var togglesValue:
        List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836>? = null

    public var toggles:
        List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836>?
      get() = togglesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        togglesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca {
      check(customTextValue != null) { "customText is required" }
      check(typeValue != null) { "type is required" }
      return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca(
        customText = customText,
        type = type,
        required = required,
        selection = selection,
        toggles = toggles,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca must be a JSON object")
      val customText = json.decodeRequired<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemCustomTextX2e01c768>(rawObject, "custom_text")
      val type = json.decodeRequired<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemTypeXd52e1726>(rawObject, "type")
      return InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca(
        customText = customText,
        type = type,
        required = rawObject["required"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        selection = rawObject["selection"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemSelectionXc58f8be2>(it) },
        toggles = rawObject["toggles"]?.let { json.decodeFromJsonElement<List<InlineV1TerminalReadersCol2891PostRequestFormInputsItemTogglesItemXbdad3836>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("custom_text", json.encodeToJsonElement(value.customText))
        put("type", json.encodeToJsonElement(value.type))
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
        value.selection?.let { put("selection", json.encodeToJsonElement(it)) }
        value.toggles?.let { put("toggles", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca(block: InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca.Builder.() -> Unit): InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca = InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersCollectInputsPostRequestFormInputsItemX49c862ca is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
