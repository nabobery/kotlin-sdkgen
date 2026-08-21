package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_unification_account_controller
 */
@Serializable(with = AccountUnificationAccountController.Serializer::class)
public class AccountUnificationAccountController(
  /**
   * The controller type. Can be `application`, if a Connect application controls the account, or `account`, if the
   * account controls itself.
   */
  public val type: InlineAccountUnificationAccountControllerTypeXb22b053e,
  public val fees: AccountUnificationAccountControllerFees? = null,
  /**
   * `true` if the Connect application retrieving the resource controls the account and can therefore exercise [platform
   * controls](https://docs.stripe.com/connect/platform-controls-for-standard-accounts). Otherwise, this field is null.
   */
  public val isController: Boolean? = null,
  public val losses: AccountUnificationAccountControllerLosses? = null,
  /**
   * A value indicating responsibility for collecting requirements on this account. Only returned when the Connect
   * application retrieving the resource controls the account.
   */
  public val requirementCollection:
      InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777? = null,
  public val stripeDashboard: AccountUnificationAccountControllerStripeDashboard? = null,
) {
  public class Builder {
    private var typeValue: InlineAccountUnificationAccountControllerTypeXb22b053e? = null

    public var type: InlineAccountUnificationAccountControllerTypeXb22b053e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var fees: AccountUnificationAccountControllerFees? = null

    /**
     * `true` if the Connect application retrieving the resource controls the account and can therefore exercise
     * [platform controls](https://docs.stripe.com/connect/platform-controls-for-standard-accounts). Otherwise, this
     * field is null.
     */
    public var isController: Boolean? = null

    public var losses: AccountUnificationAccountControllerLosses? = null

    /**
     * A value indicating responsibility for collecting requirements on this account. Only returned when the Connect
     * application retrieving the resource controls the account.
     */
    public var requirementCollection:
        InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777? = null

    public var stripeDashboard: AccountUnificationAccountControllerStripeDashboard? = null

    public fun build(): AccountUnificationAccountController {
      check(typeValue != null) { "type is required" }
      return AccountUnificationAccountController(
        type = type,
        fees = fees,
        isController = isController,
        losses = losses,
        requirementCollection = requirementCollection,
        stripeDashboard = stripeDashboard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountUnificationAccountController = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountUnificationAccountController> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountUnificationAccountController {
      val jsonDecoder = decoder.requireJsonDecoder("AccountUnificationAccountController")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountUnificationAccountController must be a JSON object")
      val type = json.decodeRequired<InlineAccountUnificationAccountControllerTypeXb22b053e>(rawObject, "type")
      return AccountUnificationAccountController(
        type = type,
        fees = rawObject["fees"]?.let { json.decodeFromJsonElement<AccountUnificationAccountControllerFees>(it) },
        isController = rawObject["is_controller"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        losses = rawObject["losses"]?.let { json.decodeFromJsonElement<AccountUnificationAccountControllerLosses>(it) },
        requirementCollection = rawObject["requirement_collection"]?.let { json.decodeFromJsonElement<InlineAccountUnificationAccountControllerRequirementCollectionX2d9f4777>(it) },
        stripeDashboard = rawObject["stripe_dashboard"]?.let { json.decodeFromJsonElement<AccountUnificationAccountControllerStripeDashboard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountUnificationAccountController) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountUnificationAccountController")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.fees?.let { put("fees", json.encodeToJsonElement(it)) }
        value.isController?.let { put("is_controller", json.encodeToJsonElement(it)) }
        value.losses?.let { put("losses", json.encodeToJsonElement(it)) }
        value.requirementCollection?.let { put("requirement_collection", json.encodeToJsonElement(it)) }
        value.stripeDashboard?.let { put("stripe_dashboard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountUnificationAccountController(block: AccountUnificationAccountController.Builder.() -> Unit): AccountUnificationAccountController = AccountUnificationAccountController.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountUnificationAccountController is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
