package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A Financial Connections Session is the secure way to programmatically launch the client-side Stripe.js modal that
 * lets your users link their accounts.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.session
 */
@Serializable(with = FinancialConnectionsSession.Serializer::class)
public class FinancialConnectionsSession(
  /**
   * The accounts that were collected as part of this Session.
   */
  public val accounts: InlineFinancialConnectionsSessionAccountsX3c0c189f,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFinancialConnectionsSessionObjectValueX4c21bf02,
  permissions: List<InlineFinancialConnectionsSessionPermissionsItemX32c905bb>,
  /**
   * The account holder for whom accounts are collected in this session.
   */
  public val accountHolder: InlineFinancialConnectionsSessionAccountHolderX5c02a6a9? = null,
  /**
   * A value that will be passed to the client to launch the authentication flow.
   */
  public val clientSecret: String? = null,
  public val filters: BankConnectionsResourceLinkAccountSessionFilters? = null,
  prefetch: List<InlineFinancialConnectionsSessionPrefetchItemX92ddd832>? = null,
  /**
   * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
   * this URL to return to your app.
   */
  public val returnUrl: String? = null,
) {
  /**
   * Permissions requested for accounts collected during this session.
   */
  public val permissions: List<InlineFinancialConnectionsSessionPermissionsItemX32c905bb> =
      permissions.toList()

  /**
   * Data features requested to be retrieved upon account creation.
   */
  public val prefetch: List<InlineFinancialConnectionsSessionPrefetchItemX92ddd832>? =
      prefetch?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountsValue: InlineFinancialConnectionsSessionAccountsX3c0c189f? = null

    public var accounts: InlineFinancialConnectionsSessionAccountsX3c0c189f
      get() = requireNotNull(accountsValue) { "accounts is required" }
      set(`value`) {
        accountsValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineFinancialConnectionsSessionObjectValueX4c21bf02? = null

    public var objectValue: InlineFinancialConnectionsSessionObjectValueX4c21bf02
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var permissionsValue: List<InlineFinancialConnectionsSessionPermissionsItemX32c905bb>? =
        null

    public var permissions: List<InlineFinancialConnectionsSessionPermissionsItemX32c905bb>
      get() = requireNotNull(permissionsValue) { "permissions is required" }.toList()
      set(`value`) {
        permissionsValue = value.toList()
      }

    /**
     * The account holder for whom accounts are collected in this session.
     */
    public var accountHolder: InlineFinancialConnectionsSessionAccountHolderX5c02a6a9? = null

    /**
     * A value that will be passed to the client to launch the authentication flow.
     */
    public var clientSecret: String? = null

    public var filters: BankConnectionsResourceLinkAccountSessionFilters? = null

    private var prefetchValue: List<InlineFinancialConnectionsSessionPrefetchItemX92ddd832>? = null

    /**
     * Data features requested to be retrieved upon account creation.
     */
    public var prefetch: List<InlineFinancialConnectionsSessionPrefetchItemX92ddd832>?
      get() = prefetchValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        prefetchValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * For webview integrations only. Upon completing OAuth login in the native browser, the user will be redirected to
     * this URL to return to your app.
     */
    public var returnUrl: String? = null

    public fun build(): FinancialConnectionsSession {
      check(accountsValue != null) { "accounts is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(permissionsValue != null) { "permissions is required" }
      return FinancialConnectionsSession(
        accounts = accounts,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        permissions = permissions,
        accountHolder = accountHolder,
        clientSecret = clientSecret,
        filters = filters,
        prefetch = prefetch,
        returnUrl = returnUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FinancialConnectionsSession = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FinancialConnectionsSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FinancialConnectionsSession {
      val jsonDecoder = decoder.requireJsonDecoder("FinancialConnectionsSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FinancialConnectionsSession must be a JSON object")
      val accounts = json.decodeRequired<InlineFinancialConnectionsSessionAccountsX3c0c189f>(rawObject, "accounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineFinancialConnectionsSessionObjectValueX4c21bf02>(rawObject, "object")
      val permissions = json.decodeRequired<List<InlineFinancialConnectionsSessionPermissionsItemX32c905bb>>(rawObject, "permissions")
      return FinancialConnectionsSession(
        accounts = accounts,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        permissions = permissions,
        accountHolder = rawObject["account_holder"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsSessionAccountHolderX5c02a6a9?>(element) },
        clientSecret = rawObject["client_secret"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        filters = rawObject["filters"]?.let { json.decodeFromJsonElement<BankConnectionsResourceLinkAccountSessionFilters>(it) },
        prefetch = rawObject["prefetch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineFinancialConnectionsSessionPrefetchItemX92ddd832>?>(element) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FinancialConnectionsSession) {
      val jsonEncoder = encoder.requireJsonEncoder("FinancialConnectionsSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("accounts", json.encodeToJsonElement(value.accounts))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("permissions", json.encodeToJsonElement(value.permissions))
        value.accountHolder?.let { put("account_holder", json.encodeToJsonElement(it)) }
        value.clientSecret?.let { put("client_secret", it) }
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.prefetch?.let { put("prefetch", json.encodeToJsonElement(it)) }
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun financialConnectionsSession(block: FinancialConnectionsSession.Builder.() -> Unit): FinancialConnectionsSession = FinancialConnectionsSession.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FinancialConnectionsSession is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
