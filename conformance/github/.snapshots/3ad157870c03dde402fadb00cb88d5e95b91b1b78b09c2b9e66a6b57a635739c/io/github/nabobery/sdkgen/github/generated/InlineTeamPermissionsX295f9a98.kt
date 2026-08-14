package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/team/properties/permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/team/properties/permissions
 */
@Serializable(with = InlineTeamPermissionsX295f9a98.Serializer::class)
public class InlineTeamPermissionsX295f9a98(
  public val admin: Boolean,
  public val maintain: Boolean,
  public val pull: Boolean,
  public val push: Boolean,
  public val triage: Boolean,
) {
  public class Builder {
    private var adminValue: Boolean? = null

    public var admin: Boolean
      get() = requireNotNull(adminValue) { "admin is required" }
      set(`value`) {
        adminValue = value
      }

    private var maintainValue: Boolean? = null

    public var maintain: Boolean
      get() = requireNotNull(maintainValue) { "maintain is required" }
      set(`value`) {
        maintainValue = value
      }

    private var pullValue: Boolean? = null

    public var pull: Boolean
      get() = requireNotNull(pullValue) { "pull is required" }
      set(`value`) {
        pullValue = value
      }

    private var pushValue: Boolean? = null

    public var push: Boolean
      get() = requireNotNull(pushValue) { "push is required" }
      set(`value`) {
        pushValue = value
      }

    private var triageValue: Boolean? = null

    public var triage: Boolean
      get() = requireNotNull(triageValue) { "triage is required" }
      set(`value`) {
        triageValue = value
      }

    public fun build(): InlineTeamPermissionsX295f9a98 {
      check(adminValue != null) { "admin is required" }
      check(maintainValue != null) { "maintain is required" }
      check(pullValue != null) { "pull is required" }
      check(pushValue != null) { "push is required" }
      check(triageValue != null) { "triage is required" }
      return InlineTeamPermissionsX295f9a98(
        admin = admin,
        maintain = maintain,
        pull = pull,
        push = push,
        triage = triage,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineTeamPermissionsX295f9a98 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineTeamPermissionsX295f9a98> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTeamPermissionsX295f9a98 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTeamPermissionsX295f9a98")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineTeamPermissionsX295f9a98 must be a JSON object")
      val admin = json.decodeRequired<Boolean>(rawObject, "admin")
      val maintain = json.decodeRequired<Boolean>(rawObject, "maintain")
      val pull = json.decodeRequired<Boolean>(rawObject, "pull")
      val push = json.decodeRequired<Boolean>(rawObject, "push")
      val triage = json.decodeRequired<Boolean>(rawObject, "triage")
      return InlineTeamPermissionsX295f9a98(
        admin = admin,
        maintain = maintain,
        pull = pull,
        push = push,
        triage = triage,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineTeamPermissionsX295f9a98) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineTeamPermissionsX295f9a98")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("admin", json.encodeToJsonElement(value.admin))
        put("maintain", json.encodeToJsonElement(value.maintain))
        put("pull", json.encodeToJsonElement(value.pull))
        put("push", json.encodeToJsonElement(value.push))
        put("triage", json.encodeToJsonElement(value.triage))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineTeamPermissionsX295f9a98(block: InlineTeamPermissionsX295f9a98.Builder.() -> Unit): InlineTeamPermissionsX295f9a98 = InlineTeamPermissionsX295f9a98.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineTeamPermissionsX295f9a98 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
