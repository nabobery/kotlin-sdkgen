package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/delete-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/delete-event
 */
@Serializable(with = DeleteEvent.Serializer::class)
public class DeleteEvent(
  public val fullRef: String,
  public val pusherType: String,
  public val ref: String,
  public val refType: String,
) {
  public class Builder {
    private var fullRefValue: String? = null

    public var fullRef: String
      get() = requireNotNull(fullRefValue) { "fullRef is required" }
      set(`value`) {
        fullRefValue = value
      }

    private var pusherTypeValue: String? = null

    public var pusherType: String
      get() = requireNotNull(pusherTypeValue) { "pusherType is required" }
      set(`value`) {
        pusherTypeValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var refTypeValue: String? = null

    public var refType: String
      get() = requireNotNull(refTypeValue) { "refType is required" }
      set(`value`) {
        refTypeValue = value
      }

    public fun build(): DeleteEvent {
      check(fullRefValue != null) { "fullRef is required" }
      check(pusherTypeValue != null) { "pusherType is required" }
      check(refValue != null) { "ref is required" }
      check(refTypeValue != null) { "refType is required" }
      return DeleteEvent(
        fullRef = fullRef,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DeleteEvent = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DeleteEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeleteEvent {
      val jsonDecoder = decoder.requireJsonDecoder("DeleteEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DeleteEvent must be a JSON object")
      val fullRef = json.decodeRequired<String>(rawObject, "full_ref")
      val pusherType = json.decodeRequired<String>(rawObject, "pusher_type")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val refType = json.decodeRequired<String>(rawObject, "ref_type")
      return DeleteEvent(
        fullRef = fullRef,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
      )
    }

    override fun serialize(encoder: Encoder, `value`: DeleteEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("DeleteEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("full_ref", value.fullRef)
        put("pusher_type", value.pusherType)
        put("ref", value.ref)
        put("ref_type", value.refType)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun deleteEvent(block: DeleteEvent.Builder.() -> Unit): DeleteEvent = DeleteEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DeleteEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
