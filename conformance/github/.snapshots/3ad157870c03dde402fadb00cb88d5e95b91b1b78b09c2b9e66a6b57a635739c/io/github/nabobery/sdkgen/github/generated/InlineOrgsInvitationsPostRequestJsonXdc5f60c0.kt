package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/post/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1invitations/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsInvitationsPostRequestJsonXdc5f60c0.Serializer::class)
public class InlineOrgsInvitationsPostRequestJsonXdc5f60c0(
  /**
   * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an
   * existing GitHub user.
   */
  public val email: String? = null,
  /**
   * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
   */
  public val inviteeId: Int? = null,
  /**
   * The role for the new member.
   * * `admin` - Organization owners with full administrative rights to the organization and complete access to all
   * repositories and teams.
   * * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.
   * * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your
   * organization.
   * * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be
   * one of the roles listed above. Only works if the invitee was previously part of your organization.
   */
  public val role: InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1? = null,
  teamIds: List<Int>? = null,
) {
  /**
   * Specify IDs for the teams you want to invite new members to.
   */
  public val teamIds: List<Int>? = teamIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an
     * existing GitHub user.
     */
    public var email: String? = null

    /**
     * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
     */
    public var inviteeId: Int? = null

    /**
     * The role for the new member.
     * * `admin` - Organization owners with full administrative rights to the organization and complete access to all
     * repositories and teams.
     * * `direct_member` - Non-owner organization members with ability to see other members and join teams by
     * invitation.
     * * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your
     * organization.
     * * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be
     * one of the roles listed above. Only works if the invitee was previously part of your organization.
     */
    public var role: InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1? = null

    private var teamIdsValue: List<Int>? = null

    /**
     * Specify IDs for the teams you want to invite new members to.
     */
    public var teamIds: List<Int>?
      get() = teamIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        teamIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineOrgsInvitationsPostRequestJsonXdc5f60c0 = InlineOrgsInvitationsPostRequestJsonXdc5f60c0(
      email = email,
      inviteeId = inviteeId,
      role = role,
      teamIds = teamIds,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsInvitationsPostRequestJsonXdc5f60c0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsInvitationsPostRequestJsonXdc5f60c0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsInvitationsPostRequestJsonXdc5f60c0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsInvitationsPostRequestJsonXdc5f60c0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsInvitationsPostRequestJsonXdc5f60c0 must be a JSON object")
      return InlineOrgsInvitationsPostRequestJsonXdc5f60c0(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        inviteeId = rawObject["invitee_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        role = rawObject["role"]?.let { json.decodeFromJsonElement<InlineOrgsInvitationsPostRequestJsonRoleX23e85eb1>(it) },
        teamIds = rawObject["team_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsInvitationsPostRequestJsonXdc5f60c0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsInvitationsPostRequestJsonXdc5f60c0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.inviteeId?.let { put("invitee_id", json.encodeToJsonElement(it)) }
        value.role?.let { put("role", json.encodeToJsonElement(it)) }
        value.teamIds?.let { put("team_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsInvitationsPostRequestJsonXdc5f60c0(block: InlineOrgsInvitationsPostRequestJsonXdc5f60c0.Builder.() -> Unit): InlineOrgsInvitationsPostRequestJsonXdc5f60c0 = InlineOrgsInvitationsPostRequestJsonXdc5f60c0.build(block)
