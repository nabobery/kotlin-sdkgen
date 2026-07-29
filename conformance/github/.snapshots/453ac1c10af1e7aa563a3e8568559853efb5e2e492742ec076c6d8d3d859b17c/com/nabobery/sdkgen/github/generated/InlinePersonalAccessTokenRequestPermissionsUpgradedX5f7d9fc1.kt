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
 * Requested permissions that elevate access for a previously approved request for access, categorized by type of
 * permission.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/personal-access-token-request/properties/permissions_upgraded
 */
@Serializable(with = InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1.Serializer::class)
public class InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1(
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

    public fun build(): InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1 = InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1(
      organization = organization,
      other = other,
      repository = repository,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1 must be a JSON object")
      return InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1(
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1")
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

public fun inlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1(block: InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1.Builder.() -> Unit): InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1 = InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1.build(block)
