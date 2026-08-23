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
 * Permissions requested, categorized by type of permission.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/organization-programmatic-access-grant/properties/permissions
 */
@Serializable(with = InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5.Serializer::class)
public class InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5(
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

    public fun build(): InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5 = InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5(
      organization = organization,
      other = other,
      repository = repository,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5 must be a JSON object")
      return InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5(
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        other = rawObject["other"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5")
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

public fun inlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5(block: InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5.Builder.() -> Unit): InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5 = InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5.build(block)
