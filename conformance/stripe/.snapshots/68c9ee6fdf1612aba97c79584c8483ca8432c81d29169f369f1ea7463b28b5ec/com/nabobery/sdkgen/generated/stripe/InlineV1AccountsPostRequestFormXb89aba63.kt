package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsPostRequestFormXb89aba63.Serializer::class)
public class InlineV1AccountsPostRequestFormXb89aba63(
  /**
   * An [account token](https://api.stripe.com#create_account_token), used to securely provide details to the account.
   */
  public val accountToken: String? = null,
  /**
   * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
   * user's bank account details.
   */
  public val bankAccount: InlineV1AccountsPostRequestFormBankAccountX631136d5? = null,
  /**
   * Business information about the account.
   */
  public val businessProfile: InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc? = null,
  /**
   * The business type. Once you create an [Account Link](/api/account_links) or [Account
   * Session](/api/account_sessions), this property can only be updated for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts.
   */
  public val businessType: InlineV1AccountsPostRequestFormBusinessTypeX724dec40? = null,
  /**
   * Each key of the dictionary represents a capability, and each capability
   * maps to its settings (for example, whether it has been requested or not). Each
   * capability is inactive until you have provided its specific
   * requirements and Stripe has verified them. An account might have some
   * of its requested capabilities be active and some be inactive.
   *
   * Required when
   * [account.controller.stripe_dashboard.type](/api/accounts/create#create_account-controller-dashboard-type)
   * is `none`, which includes Custom accounts.
   */
  public val capabilities: InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e? = null,
  /**
   * Information about the company or business. This field is available for any `business_type`. Once you create an
   * [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this property can only be updated
   * for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts.
   */
  public val company: InlineV1AccountsPostRequestFormCompanyXa0d80ea7? = null,
  /**
   * A hash of configuration describing the account controller's attributes.
   */
  public val controller: InlineV1AccountsPostRequestFormControllerX9fb1c2f9? = null,
  /**
   * The country in which the account holder resides, or in which the business is legally established. This should be an
   * ISO 3166-1 alpha-2 country code. For example, if you are in the United States and the business for which you're
   * creating an account is legally represented in Canada, you would use `CA` as the country for the account being
   * created. Available countries include [Stripe's global markets](https://stripe.com/global) as well as countries
   * where [cross-border payouts](https://stripe.com/docs/connect/cross-border-payouts) are supported.
   */
  public val country: String? = null,
  /**
   * Three-letter ISO currency code representing the default currency for the account. This must be a currency that
   * [Stripe supports in the account's country](https://docs.stripe.com/payouts).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val defaultCurrency: String? = null,
  /**
   * Documents that may be submitted to satisfy various informational requests.
   */
  public val documents: InlineV1AccountsPostRequestFormDocumentsXe7387a38? = null,
  /**
   * The email address of the account holder. This is only to make the account easier to identify to you. If
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts, Stripe doesn't email the account without your consent.
   */
  public val email: String? = null,
  expand: List<String>? = null,
  /**
   * A card or bank account to attach to the account for receiving [payouts](/connect/bank-debit-card-payouts) (you
   * won’t be able to use it for top-ups). You can provide either a token, like the ones returned by [Stripe.js](/js),
   * or a dictionary, as documented in the `external_account` parameter for [bank
   * account](/api#account_create_bank_account) creation. <br><br>By default, providing an external account sets it as
   * the new default external account for its currency, and deletes the old default if one exists. To add additional
   * external accounts without replacing the existing default for the currency, use the [bank
   * account](/api#account_create_bank_account) or [card creation](/api#account_create_card) APIs. After you create an
   * [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this property can only be updated
   * for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts.
   */
  public val externalAccount: String? = null,
  /**
   * A hash of account group type to tokens. These are account groups this account should be added to.
   */
  public val groups: InlineV1AccountsPostRequestFormGroupsX5f919c2b? = null,
  /**
   * Information about the person represented by the account. This field is null unless `business_type` is set to
   * `individual`. Once you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions),
   * this property can only be updated for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts.
   */
  public val individual: InlineV1AccountsPostRequestFormIndividualX5383dde5? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1AccountsPostRequestFormMetadataX5d8f3c72? = null,
  /**
   * Options for customizing how the account functions within Stripe.
   */
  public val settings: InlineV1AccountsPostRequestFormSettingsXbfba4b7f? = null,
  /**
   * Details on the account's acceptance of the [Stripe Services Agreement](/connect/updating-accounts#tos-acceptance).
   * This property can only be updated for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `application`, which includes Custom accounts. This property defaults to a `full` service agreement when empty.
   */
  public val tosAcceptance: InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc? = null,
  /**
   * The `type` parameter is deprecated. Use [`controller`](/api/accounts/create#create_account-controller) instead to
   * configure dashboard access, fee payer, loss liability, and requirement collection.
   */
  public val type: InlineV1AccountsPostRequestFormTypeXf359fa3d? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * An [account token](https://api.stripe.com#create_account_token), used to securely provide details to the account.
     */
    public var accountToken: String? = null

    /**
     * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
     * user's bank account details.
     */
    public var bankAccount: InlineV1AccountsPostRequestFormBankAccountX631136d5? = null

    /**
     * Business information about the account.
     */
    public var businessProfile: InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc? = null

    /**
     * The business type. Once you create an [Account Link](/api/account_links) or [Account
     * Session](/api/account_sessions), this property can only be updated for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts.
     */
    public var businessType: InlineV1AccountsPostRequestFormBusinessTypeX724dec40? = null

    /**
     * Each key of the dictionary represents a capability, and each capability
     * maps to its settings (for example, whether it has been requested or not). Each
     * capability is inactive until you have provided its specific
     * requirements and Stripe has verified them. An account might have some
     * of its requested capabilities be active and some be inactive.
     *
     * Required when
     * [account.controller.stripe_dashboard.type](/api/accounts/create#create_account-controller-dashboard-type)
     * is `none`, which includes Custom accounts.
     */
    public var capabilities: InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e? = null

    /**
     * Information about the company or business. This field is available for any `business_type`. Once you create an
     * [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this property can only be updated
     * for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts.
     */
    public var company: InlineV1AccountsPostRequestFormCompanyXa0d80ea7? = null

    /**
     * A hash of configuration describing the account controller's attributes.
     */
    public var controller: InlineV1AccountsPostRequestFormControllerX9fb1c2f9? = null

    /**
     * The country in which the account holder resides, or in which the business is legally established. This should be
     * an ISO 3166-1 alpha-2 country code. For example, if you are in the United States and the business for which
     * you're creating an account is legally represented in Canada, you would use `CA` as the country for the account
     * being created. Available countries include [Stripe's global markets](https://stripe.com/global) as well as
     * countries where [cross-border payouts](https://stripe.com/docs/connect/cross-border-payouts) are supported.
     */
    public var country: String? = null

    /**
     * Three-letter ISO currency code representing the default currency for the account. This must be a currency that
     * [Stripe supports in the account's country](https://docs.stripe.com/payouts).
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var defaultCurrency: String? = null

    /**
     * Documents that may be submitted to satisfy various informational requests.
     */
    public var documents: InlineV1AccountsPostRequestFormDocumentsXe7387a38? = null

    /**
     * The email address of the account holder. This is only to make the account easier to identify to you. If
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts, Stripe doesn't email the account without your consent.
     */
    public var email: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * A card or bank account to attach to the account for receiving [payouts](/connect/bank-debit-card-payouts) (you
     * won’t be able to use it for top-ups). You can provide either a token, like the ones returned by [Stripe.js](/js),
     * or a dictionary, as documented in the `external_account` parameter for [bank
     * account](/api#account_create_bank_account) creation. <br><br>By default, providing an external account sets it as
     * the new default external account for its currency, and deletes the old default if one exists. To add additional
     * external accounts without replacing the existing default for the currency, use the [bank
     * account](/api#account_create_bank_account) or [card creation](/api#account_create_card) APIs. After you create an
     * [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this property can only be updated
     * for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts.
     */
    public var externalAccount: String? = null

    /**
     * A hash of account group type to tokens. These are account groups this account should be added to.
     */
    public var groups: InlineV1AccountsPostRequestFormGroupsX5f919c2b? = null

    /**
     * Information about the person represented by the account. This field is null unless `business_type` is set to
     * `individual`. Once you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions),
     * this property can only be updated for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts.
     */
    public var individual: InlineV1AccountsPostRequestFormIndividualX5383dde5? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1AccountsPostRequestFormMetadataX5d8f3c72? = null

    /**
     * Options for customizing how the account functions within Stripe.
     */
    public var settings: InlineV1AccountsPostRequestFormSettingsXbfba4b7f? = null

    /**
     * Details on the account's acceptance of the [Stripe Services
     * Agreement](/connect/updating-accounts#tos-acceptance). This property can only be updated for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `application`, which includes Custom accounts. This property defaults to a `full` service agreement when empty.
     */
    public var tosAcceptance: InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc? = null

    /**
     * The `type` parameter is deprecated. Use [`controller`](/api/accounts/create#create_account-controller) instead to
     * configure dashboard access, fee payer, loss liability, and requirement collection.
     */
    public var type: InlineV1AccountsPostRequestFormTypeXf359fa3d? = null

    public fun build(): InlineV1AccountsPostRequestFormXb89aba63 = InlineV1AccountsPostRequestFormXb89aba63(
      accountToken = accountToken,
      bankAccount = bankAccount,
      businessProfile = businessProfile,
      businessType = businessType,
      capabilities = capabilities,
      company = company,
      controller = controller,
      country = country,
      defaultCurrency = defaultCurrency,
      documents = documents,
      email = email,
      expand = expand,
      externalAccount = externalAccount,
      groups = groups,
      individual = individual,
      metadata = metadata,
      settings = settings,
      tosAcceptance = tosAcceptance,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormXb89aba63 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormXb89aba63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormXb89aba63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormXb89aba63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormXb89aba63 must be a JSON object")
      return InlineV1AccountsPostRequestFormXb89aba63(
        accountToken = rawObject["account_token"]?.let { json.decodeFromJsonElement<String>(it) },
        bankAccount = rawObject["bank_account"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBankAccountX631136d5>(it) },
        businessProfile = rawObject["business_profile"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessProfileXb836e1dc>(it) },
        businessType = rawObject["business_type"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormBusinessTypeX724dec40>(it) },
        capabilities = rawObject["capabilities"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e>(it) },
        company = rawObject["company"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyXa0d80ea7>(it) },
        controller = rawObject["controller"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormControllerX9fb1c2f9>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultCurrency = rawObject["default_currency"]?.let { json.decodeFromJsonElement<String>(it) },
        documents = rawObject["documents"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsXe7387a38>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        externalAccount = rawObject["external_account"]?.let { json.decodeFromJsonElement<String>(it) },
        groups = rawObject["groups"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormGroupsX5f919c2b>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualX5383dde5>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormMetadataX5d8f3c72>(it) },
        settings = rawObject["settings"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormSettingsXbfba4b7f>(it) },
        tosAcceptance = rawObject["tos_acceptance"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormTypeXf359fa3d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormXb89aba63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormXb89aba63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.accountToken?.let { put("account_token", it) }
        value.bankAccount?.let { put("bank_account", json.encodeToJsonElement(it)) }
        value.businessProfile?.let { put("business_profile", json.encodeToJsonElement(it)) }
        value.businessType?.let { put("business_type", json.encodeToJsonElement(it)) }
        value.capabilities?.let { put("capabilities", json.encodeToJsonElement(it)) }
        value.company?.let { put("company", json.encodeToJsonElement(it)) }
        value.controller?.let { put("controller", json.encodeToJsonElement(it)) }
        value.country?.let { put("country", it) }
        value.defaultCurrency?.let { put("default_currency", it) }
        value.documents?.let { put("documents", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.externalAccount?.let { put("external_account", it) }
        value.groups?.let { put("groups", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.settings?.let { put("settings", json.encodeToJsonElement(it)) }
        value.tosAcceptance?.let { put("tos_acceptance", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormXb89aba63(block: InlineV1AccountsPostRequestFormXb89aba63.Builder.() -> Unit): InlineV1AccountsPostRequestFormXb89aba63 = InlineV1AccountsPostRequestFormXb89aba63.build(block)
