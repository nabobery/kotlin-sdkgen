package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1remove_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items
 */
@Serializable(with = InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55.Serializer::class)
public class InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55(
  public val behavior: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839,
  public val id: String,
) {
  public class Builder {
    private var behaviorValue: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839?
        = null

    public var behavior: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839
      get() = requireNotNull(behaviorValue) { "behavior is required" }
      set(`value`) {
        behaviorValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    public fun build(): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 {
      check(behaviorValue != null) { "behavior is required" }
      check(idValue != null) { "id is required" }
      return InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55(
        behavior = behavior,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 must be a JSON object")
      val behavior = json.decodeRequired<InlineV1InvoicesRemoveLinesPostRequestFormLinesItemBehaviorX8288b839>(rawObject, "behavior")
      val id = json.decodeRequired<String>(rawObject, "id")
      return InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55(
        behavior = behavior,
        id = id,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("behavior", json.encodeToJsonElement(value.behavior))
        put("id", value.id)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55(block: InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55.Builder.() -> Unit): InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 = InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesRemoveLinesPostRequestFormLinesItemXe21b4f55 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
