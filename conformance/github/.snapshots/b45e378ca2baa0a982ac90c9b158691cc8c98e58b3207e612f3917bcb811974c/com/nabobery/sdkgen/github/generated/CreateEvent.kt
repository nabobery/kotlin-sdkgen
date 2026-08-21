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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/create-event.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/create-event
 */
@Serializable(with = CreateEvent.Serializer::class)
public class CreateEvent(
  public val fullRef: String,
  public val masterBranch: String,
  public val pusherType: String,
  public val ref: String,
  public val refType: String,
  public val description: String? = null,
) {
  public class Builder {
    private var fullRefValue: String? = null

    public var fullRef: String
      get() = requireNotNull(fullRefValue) { "fullRef is required" }
      set(`value`) {
        fullRefValue = value
      }

    private var masterBranchValue: String? = null

    public var masterBranch: String
      get() = requireNotNull(masterBranchValue) { "masterBranch is required" }
      set(`value`) {
        masterBranchValue = value
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

    public var description: String? = null

    public fun build(): CreateEvent {
      check(fullRefValue != null) { "fullRef is required" }
      check(masterBranchValue != null) { "masterBranch is required" }
      check(pusherTypeValue != null) { "pusherType is required" }
      check(refValue != null) { "ref is required" }
      check(refTypeValue != null) { "refType is required" }
      return CreateEvent(
        fullRef = fullRef,
        masterBranch = masterBranch,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateEvent {
      val jsonDecoder = decoder.requireJsonDecoder("CreateEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateEvent must be a JSON object")
      val fullRef = json.decodeRequired<String>(rawObject, "full_ref")
      val masterBranch = json.decodeRequired<String>(rawObject, "master_branch")
      val pusherType = json.decodeRequired<String>(rawObject, "pusher_type")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val refType = json.decodeRequired<String>(rawObject, "ref_type")
      return CreateEvent(
        fullRef = fullRef,
        masterBranch = masterBranch,
        pusherType = pusherType,
        ref = ref,
        refType = refType,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("full_ref", value.fullRef)
        put("master_branch", value.masterBranch)
        put("pusher_type", value.pusherType)
        put("ref", value.ref)
        put("ref_type", value.refType)
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createEvent(block: CreateEvent.Builder.() -> Unit): CreateEvent = CreateEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
