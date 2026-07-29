package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/org-membership/properties/permissions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-membership/properties/permissions
 */
@Serializable(with = InlineOrgMembershipPermissionsXb96bf417.Serializer::class)
public class InlineOrgMembershipPermissionsXb96bf417(
  public val canCreateRepository: Boolean,
) {
  public class Builder {
    private var canCreateRepositoryValue: Boolean? = null

    public var canCreateRepository: Boolean
      get() = requireNotNull(canCreateRepositoryValue) { "canCreateRepository is required" }
      set(`value`) {
        canCreateRepositoryValue = value
      }

    public fun build(): InlineOrgMembershipPermissionsXb96bf417 {
      check(canCreateRepositoryValue != null) { "canCreateRepository is required" }
      return InlineOrgMembershipPermissionsXb96bf417(
        canCreateRepository = canCreateRepository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgMembershipPermissionsXb96bf417 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgMembershipPermissionsXb96bf417> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgMembershipPermissionsXb96bf417 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgMembershipPermissionsXb96bf417")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgMembershipPermissionsXb96bf417 must be a JSON object")
      val canCreateRepository = json.decodeRequired<Boolean>(rawObject, "can_create_repository")
      return InlineOrgMembershipPermissionsXb96bf417(
        canCreateRepository = canCreateRepository,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgMembershipPermissionsXb96bf417) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgMembershipPermissionsXb96bf417")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("can_create_repository", json.encodeToJsonElement(value.canCreateRepository))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgMembershipPermissionsXb96bf417(block: InlineOrgMembershipPermissionsXb96bf417.Builder.() -> Unit): InlineOrgMembershipPermissionsXb96bf417 = InlineOrgMembershipPermissionsXb96bf417.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgMembershipPermissionsXb96bf417 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
