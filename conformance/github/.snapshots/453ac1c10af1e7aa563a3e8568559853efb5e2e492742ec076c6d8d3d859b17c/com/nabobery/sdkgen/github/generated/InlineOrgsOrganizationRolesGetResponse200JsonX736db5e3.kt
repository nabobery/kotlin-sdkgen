package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1organization-roles/get/responses/200/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1organization-roles/get/responses/200/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3.Serializer::class)
public class InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3(
  roles: List<OrganizationRole>? = null,
  /**
   * The total number of organization roles available to the organization.
   */
  public val totalCount: Int? = null,
) {
  /**
   * The list of organization roles available to the organization.
   */
  public val roles: List<OrganizationRole>? = roles?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var rolesValue: List<OrganizationRole>? = null

    /**
     * The list of organization roles available to the organization.
     */
    public var roles: List<OrganizationRole>?
      get() = rolesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        rolesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The total number of organization roles available to the organization.
     */
    public var totalCount: Int? = null

    public fun build(): InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3 = InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3(
      roles = roles,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3 must be a JSON object")
      return InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3(
        roles = rawObject["roles"]?.let { json.decodeFromJsonElement<List<OrganizationRole>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.roles?.let { put("roles", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsOrganizationRolesGetResponse200JsonX736db5e3(block: InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3.Builder.() -> Unit): InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3 = InlineOrgsOrganizationRolesGetResponse200JsonX736db5e3.build(block)
