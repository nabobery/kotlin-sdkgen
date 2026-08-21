package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Permissions requested, categorized by type of permission. This field incorporates `permissions_added` and
 * `permissions_upgraded`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/personal-access-token-request/properties/permissions_result
 */
@Serializable(with = InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc.Serializer::class)
public class InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc(
  organization: Map<String, String>? = null,
  other: Map<String, String>? = null,
  repository: Map<String, String>? = null,
) {
  public val organization: Map<String, String>? =
      organization?.let { collection0 -> collection0.toMap() }

  public val other: Map<String, String>? = other?.let { collection0 -> collection0.toMap() }

  public val repository: Map<String, String>? =
      repository?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var organizationValue: Map<String, String>? = null

    public var organization: Map<String, String>?
      get() = organizationValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        organizationValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var otherValue: Map<String, String>? = null

    public var other: Map<String, String>?
      get() = otherValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        otherValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var repositoryValue: Map<String, String>? = null

    public var repository: Map<String, String>?
      get() = repositoryValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        repositoryValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc = InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc(
      organization = organization,
      other = other,
      repository = repository,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc must be a JSON object")
      return InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc(
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.other?.let { put("other", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePersonalAccessTokenRequestPermissionsResultX4b7274bc(block: InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc.Builder.() -> Unit): InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc = InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc.build(block)
